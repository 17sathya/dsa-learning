class Solution{
    public int[] intersection(int[] a,int b[]){
        List<Integer> result=new ArrayList<>();
        int i =0,j=0;

        while(i<a.length && j<b.length){
            if(a[i]<b[j]) i++;
            else if (a[i]>b[j]) j++;
            else{
                result.add(a[i]); //common element
                i++;j++;
            }
        }
        return result.stream().mapToInt(x->x).toArray();
    }

}
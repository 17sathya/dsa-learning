class Solution{
    public int removeDuplicates(int[] arr){
        if(arr.length==0)return 0;
        int slow=0;

        for(int fast =1; fast<arr.length;fast++){
            if(arr[fast]!=arr[slow]){
                slow++;
                arr[slow]=arr[fast]; // place unique element
            }
        }

        return slow+1; //new length
    }
}

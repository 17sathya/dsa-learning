class Solution{
    public void rotate(int[] arr ,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,k-1); // reverse first k
        reverse(arr,k,n-1); // reverse rest
        reverse(arr,0,n-1); //reverse whole 
    }

    void reverse(int[] arr,int left,int right){
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            
        }
    }
}

class Solution{
    public int missingNumber(int[] arr){
        int n=arr.length;
        int expected =n*(n+1)/2;
        int actual=0;
        for(int num:arr) actual+=num;
        return expected - actual;
    }
}
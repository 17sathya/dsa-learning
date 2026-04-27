class Solution{
    public int findduplicates(int [] arr){
        int slow=arr[0];
        int fast=arr[0];

        //phase 1 - find interaction
        
        do{
            slow=arr[slow];
            fast=arr[arr[fast]];
        } while(slow!=fast);

        // phase 2 - find duplicate 
        slow =arr[0];
        while(slow!=fast){
            slow=arr[slow];
            fast=arr[fast];

        }
        return slow;
    }

}
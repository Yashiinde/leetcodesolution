class Solution {
    public int pivotIndex(int[] nums) {
        // int sum[]=new int[nums.length];
        int tot=0;
        int add=0;
        for(int i=nums.length-1;i>=0;i--){
            tot+=nums[i];
            // sum[i]=sum[i-1]+nums[i-1];
        }
        
        for(int j=0;j<nums.length;j++){
           tot-=nums[j];
           if(tot==add){
                return j;
            } 
            add+=nums[j];
            
        }
        return -1;
    }
}
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int j=0;
        int length=nums.length+1;
        int num=0;
        while(i<nums.length && j<nums.length){
            num+=nums[j];
            while(num>=target){
                length=Math.min(length,j-i+1);
                num-=nums[i];
                i++;
                
            }
                j++;
            }
        
        if(length==nums.length+1){
            return 0;
        }
        return length;
    }
}
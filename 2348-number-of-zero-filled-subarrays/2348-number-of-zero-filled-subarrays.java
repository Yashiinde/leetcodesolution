class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int temp=0;
        long count=0;
        for( int i=0;i<nums.length;i++){
            if(nums[i]==0){
                temp+=1;
                count+=temp;
            }else{
                temp=0;
            }
        }
        return count;
    }
}
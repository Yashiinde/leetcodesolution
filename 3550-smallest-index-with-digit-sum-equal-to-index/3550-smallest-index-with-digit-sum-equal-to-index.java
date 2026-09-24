class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int rem=0;
            while(num!=0){
                rem+=num%10;
                num/=10;
            }
            if(rem==i){
                return i;
            }
        }
        return -1;
    }
}
class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
       int median=nums[nums.length/2];
        int min=0;
        for(int i=0;i<nums.length;i++){
            min+=Math.abs(nums[i]-median);
        }
        return min;
    }
}
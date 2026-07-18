class Solution {
    public int findGCD(int[] nums) {
       int max=Integer.MIN_VALUE;
       int min=Integer.MAX_VALUE;
       for(int num:nums){
            max=Math.max(max,num);
            min=Math.min(min,num);
       }
       while(min!=0){
            int rem=max%min;
            max=min;
            min=rem;
       }
      return max;
    }
}
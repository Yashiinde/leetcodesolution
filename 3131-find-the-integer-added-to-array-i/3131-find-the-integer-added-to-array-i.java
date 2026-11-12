class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
       int sum1=0;
       int sum2=0;
       for(int i=0;i<nums2.length;i++){
        sum1+=nums2[i];
        sum2+=nums1[i];
       }
       int sum=(sum1-sum2)/nums2.length;
       return sum;
    }
}
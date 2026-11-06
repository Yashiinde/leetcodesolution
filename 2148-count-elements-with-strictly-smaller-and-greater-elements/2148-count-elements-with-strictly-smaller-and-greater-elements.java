class Solution {
    public int countElements(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int num:nums){
            if(max<num){
                max=num;
            }if(min>num){
                min=num;
            }
        }
        int count=0;
        for(int num:nums){
            if(num<max && num>min){
                count++;
            }
        }
        return count;
    }
}
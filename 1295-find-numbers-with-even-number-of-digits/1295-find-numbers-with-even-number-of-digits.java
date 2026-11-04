class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums){
            if(num>9 && num<100){
                count++;
            }else if(num>999 && num<10000){
                count++;
            }else if(num==100000){
                count++;
            }
        }
        return count;
    }
}
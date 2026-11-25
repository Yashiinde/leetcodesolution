class Solution {
    public int maxFrequencyElements(int[] nums) {
        int arr[]=new int[101];
        for(int num:nums){
            arr[num]++;
        }
        int max=0;
        for(int num:arr){
            if(num>max){
                max=num;
            }
        }
        int count=0;
        for(int num:arr){
            if(num==max){
                count+=max;
            }
        }
        return count;
    }
}
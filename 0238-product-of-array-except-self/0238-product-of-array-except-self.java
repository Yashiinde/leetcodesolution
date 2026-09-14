class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr=new int[nums.length];
        int prod=nums[0];
        arr[0]=1;
        for(int i=1;i<nums.length;i++){
            arr[i]=prod;
            prod*=nums[i];
        }
        prod=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            arr[i]*=prod;
            prod*=nums[i];
        }
        return arr;
    }
}
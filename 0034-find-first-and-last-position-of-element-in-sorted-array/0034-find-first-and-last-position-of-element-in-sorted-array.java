class Solution {
    public int left(int nums[],int target){
        int si=0;
        int ei=nums.length-1;
        int index=-1;
        while(si<=ei){
            int mid=si+(ei-si)/2;
            if(nums[mid]>=target){
                ei=mid-1;
            }else{
                si=mid+1;
            }
            if(nums[mid]==target){
                index=mid;
            }

        }
        return index;

    }
    public int right(int nums[],int target){
        int si=0;
        int ei=nums.length-1;
        int index=-1;
        while(si<=ei){
            int mid=si+(ei-si)/2;
            if(nums[mid]<=target){
                si=mid+1;
            }else{
                ei=mid-1;
            }
            if(nums[mid]==target){
                index=mid;
            }

        }
        return index;

    }
    public int[] searchRange(int[] nums, int target) {
        int temp[]=new int[2];
        temp[0]=left(nums,target);
        temp[1]=right(nums,target);
        return temp;
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int j=0;j<nums.length;j++){
           int num=target-nums[j];
           if(map.containsKey(num)){
            arr[0]=map.get(num);
            arr[1]=j;
            break;
           }
           map.put(nums[j],j);
        }
        return arr;
    }
}
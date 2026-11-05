class Solution {
    public int[] findErrorNums(int[] nums) {
        int arr[]=new int[2];
        HashSet<Integer> set=new HashSet<>();
        int n=nums.length;
        for(int num:nums){
            if(set.contains(num)){
                arr[0]=num;
            }
            set.add(num);
        }
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                arr[1]=i;
                break;
            }
        }
        return arr;
    }
}
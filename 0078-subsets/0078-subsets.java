class Solution {
    public void findsubsets(int[] nums,List<List<Integer>> list1,List<Integer> list2,int i){
        if(i==nums.length){
            list1.add(new ArrayList<>(list2));
            return;
        }
        list2.add(nums[i]);
        findsubsets(nums,list1,list2,i+1);
        list2.remove(list2.size()-1);
        findsubsets(nums,list1,list2,i+1);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        findsubsets(nums,list1,list2,0);
        return list1;
    }
}
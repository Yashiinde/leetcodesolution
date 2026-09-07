class Solution {
    public void getpermu(List<List<Integer>> ans,int idx,List<Integer> list){
        if(idx==list.size()){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=idx;i<list.size();i++){
             Collections.swap(list, idx, i);
             getpermu(ans,idx+1,list);
            Collections.swap(list, idx, i);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
         getpermu(ans,0,list);
         return ans;
    }
}
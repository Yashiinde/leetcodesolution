class Solution {
    public void combine(int[] candidates,List<List<Integer>> list1,List<Integer> list2,int target,int sum,int i){
        // if(sum==target){
        //     list1.add(new ArrayList<>(list2));
        //     return;
        // }
        if(i==candidates.length){
            return;
        }
        list2.add(candidates[i]);
        sum+=candidates[i];
        if(sum<target){
            combine(candidates,list1,list2,target,sum,i);
           
        }else if(sum==target){
            list1.add(new ArrayList<>(list2));
            // list2.remove(list2.size()-1);
            // return;
        }
            list2.remove(list2.size()-1);
            sum-=candidates[i];
            combine(candidates,list1,list2,target,sum,i+1);
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        combine(candidates,list1,list2,target,0,0);
        return list1;
    }
}
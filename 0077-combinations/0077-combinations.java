class Solution {
    public void combination(List<List<Integer>> list1,List<Integer> list2,int n,int k,int i){
        if(list2.size()==k){
            list1.add(new ArrayList<>(list2));
            return;
        }
        if(i==n){
            return;
        }
        list2.add(i);
        combination(list1,list2,n,k,i+1);
        list2.remove(list2.size()-1);
        combination(list1,list2,n,k,i+1);

    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list1= new ArrayList<>();
        List<Integer> list2 =new ArrayList<>();
        combination(list1,list2,n+1,k,1);
        return list1;
    }
}
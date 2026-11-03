class Solution {
    public int distributeCandies(int[] candyType) {
       HashSet<Integer> set=new HashSet<>();
       for(int num:candyType){
        if(!set.contains(num)){
            set.add(num);
        }
       }
       int size = set.size();
        int max=candyType.length/2;
        return Math.min(max,size);
    }
}
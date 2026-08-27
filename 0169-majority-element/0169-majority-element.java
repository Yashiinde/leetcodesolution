class Solution {
    public int majorityElement(int[] nums) {
    int n=nums.length/2;
      HashMap<Integer,Integer> keys=new HashMap<>();
      for(int i=0;i<nums.length;i++){
        int num=nums[i];
        if(keys.containsKey(num)){
            keys.put(num,(keys.get(num))+1);
        }else{
            keys.put(num,1);
        }
      } 
    Set<Integer> keyset=keys.keySet(); 
      int majority=0;
      for(Integer key:keyset){
        if(keys.get(key)>n){
            majority=key;
            break;
        }
      }
      return majority;
    }
}
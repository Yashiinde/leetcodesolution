class Solution {
    public int majorityElement(int[] nums) {
    int n=nums.length/2;
      HashMap<Integer,Integer> keys=new HashMap<>();
      for(int i=0;i<nums.length;i++){
        int num=nums[i];
        keys.put(num,keys.getOrDefault(num,0)+1);
    
      } 
      int majority=0;
      for(Integer key:keys.keySet()){
        if(keys.get(key)>n){
            majority=key;
            break;
        }
      }
      return majority;
    }
}
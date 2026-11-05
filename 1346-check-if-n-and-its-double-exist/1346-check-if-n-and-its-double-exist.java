class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer,Integer> set=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            set.put(arr[i],i);
        }
        for(int i=0;i<arr.length;i++){
            int dub=arr[i]*2;
            if(set.containsKey(dub)){
                if(set.get(dub)!=i){
                    return true;
                }
                
            }
        }
        return false;
    }
}
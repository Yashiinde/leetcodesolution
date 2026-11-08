class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int arr[]=new int[k];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int mat[][]=new int[map.size()][2];
        int i=0;
        for(int key:map.keySet()){
            mat[i][0]=key;
            mat[i][1]=map.get(key);
            i++;
        }
        Arrays.sort(mat, (a, b) -> Integer.compare(b[1], a[1]));
        for(i=0;i<k;i++){
            arr[i]=mat[i][0];
        }
        return arr;
    }
}
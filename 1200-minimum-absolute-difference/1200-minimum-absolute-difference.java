class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> list= new ArrayList<>();
        // List<Integer> level= new ArrayList<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            int diff=arr[i+1]-arr[i];
            // level= new ArrayList<>();
            if(min>diff){
                list.clear();
                min=diff;
            }if(min==diff){
                // level.add(arr[i]);
                // level.add(arr[i+1]);
                // list.add(level);
                list.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return list;
    }
}
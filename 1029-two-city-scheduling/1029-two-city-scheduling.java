class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int n=costs.length;
        //ArrayList<integer> list =new ArrayList<>();
        int arr[][]=new int[n][3];
        for(int i=0;i<n;i++){
            arr[i][0]=costs[i][0];
            arr[i][1]=costs[i][1];
            arr[i][2]=costs[i][0]-costs[i][1];
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(a[2], b[2]));
        int cost=0;
        for(int j=0;j<n;j++){
            if((n/2)>j){
                cost+=arr[j][0];
            }else{
                cost+=arr[j][1];
            }
        }
        return cost;
    }
}
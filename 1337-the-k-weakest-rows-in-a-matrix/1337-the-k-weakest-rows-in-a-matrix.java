class Solution {
    static class row implements Comparable<row>{
        int soldiers;
        int idx;
        public row(int soldiers,int idx){
            this.soldiers=soldiers;
            this.idx=idx;
        }
        @Override
        public int compareTo(row r2){
            if(this.soldiers==r2.soldiers){
                return this.idx-r2.idx;
            }else{
                return this.soldiers-r2.soldiers;
            }
        }
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        int arr[]=new int[k];
        PriorityQueue<row> pq = new PriorityQueue<>();
        for(int i=0;i<mat.length;i++){
            int count=0;
            for(int j=0;j<mat[0].length;j++){
                count+=mat[i][j];
            }
            pq.add(new row(count,i));
        }
        int l=0;
        while(l<k){
            arr[l]=pq.remove().idx;
            l++;
        }
        return arr;
    }
}
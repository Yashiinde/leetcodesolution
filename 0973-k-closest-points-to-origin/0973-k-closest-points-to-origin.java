class Solution {
     static class Point implements Comparable<Point> {
            int x;
            int y;
            int dist;
            int idx;
            public Point(int x,int y,int dist,int idx){
                this.x=x;
                this.y=y;
                this.dist=dist;
                this.idx=idx;
            }
            @Override
            public int compareTo(Point p2){
                return this.dist-p2.dist;
            }
     }
    public int[][] kClosest(int[][] points, int k) {
    int[][] arr=new int[k][2];
       PriorityQueue<Point> pq = new PriorityQueue<>();
       
       for(int i=0;i<points.length;i++){
        int dist=points[i][0]*points[i][0] + points[i][1]*points[i][1];
        pq.add(new Point(points[i][0],points[i][1],dist,i));
       }
       for(int j=0;j<k;j++){
            int id=pq.remove().idx;
            arr[j][0]=points[id][0];
            arr[j][1]=points[id][1];
       }
       return arr;
    }
}

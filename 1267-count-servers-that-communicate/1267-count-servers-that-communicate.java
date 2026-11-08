class Solution {
    public int check(int[][] grid,int idx,int col){
        for(int i = 0; i < grid.length; i++) {
            if(i != idx && grid[i][col] == 1) {
                return 1;
            }
        }
        for(int j = 0; j < grid[0].length; j++) {
            if(j != col && grid[idx][j] == 1) {
                return 1;
            }
        }
        return 0;
    }
    public int countServers(int[][] grid) {
        int server=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                   int num= check(grid,i,j);
                   server+=num;
                }
            }
        }
        return server;
    }
}
class Solution {
    public boolean isSafe(char[][] board ,int row,int col){
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public void addto(char[][] board,List<List<String>> list1){
        StringBuilder str=new StringBuilder("");
        List<String> list2=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            str=new StringBuilder("");
            for(int j=0;j<board.length;j++){
                str.append(board[i][j]);
            }
            list2.add(str.toString());
        }
        list1.add(list2);
    }
    public void nqueen(char board[][] , int row ,List<List<String>> list1){
        if(row==board.length){
            addto(board,list1);
            return;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                nqueen(board,row+1,list1);
                board[row][j]='.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> list1 = new ArrayList<>();
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        nqueen(board,0,list1);
        return list1;

    }
}
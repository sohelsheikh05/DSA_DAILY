class Solution {
    public void gameOfLife(int[][] board) {
        int m=board.length,n=board[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int count=getCount(i,j,board);

                if(board[i][j]==1){
                    if(count<2 || count>3) board[i][j]=-1;
                        }
                    else{
                        if(count==3) board[i][j]=2;
                    }
                }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                board[i][j] = board[i][j] > 0 ? 1 : 0;
            }
        }
    }
  int getCount(int i,int j,int board[][]){
    int count=0;
    int m=board.length;
    int n=board[0].length;

    if(i>0 && j>0 && Math.abs(board[i-1][j-1])==1) count++;
    if(i>0 && Math.abs(board[i-1][j])==1) count++;
    if(i>0 && j<n-1 && Math.abs(board[i-1][j+1])==1) count++;

    if(j>0 && Math.abs(board[i][j-1])==1) count++;
    if(j<n-1 && Math.abs(board[i][j+1])==1) count++;

    if(i<m-1 && j>0 && Math.abs(board[i+1][j-1])==1) count++;
    if(i<m-1 && Math.abs(board[i+1][j])==1) count++;
    if(i<m-1 && j<n-1 && Math.abs(board[i+1][j+1])==1) count++;

    return count;
}
}
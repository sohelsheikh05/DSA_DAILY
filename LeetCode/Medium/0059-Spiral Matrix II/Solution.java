class Solution {
    public int[][] generateMatrix(int n) {
        int mat[][]=new int[n][n];
        int val=1;
        int top=0,bottom=n-1,left=0,right=n-1;
        while(left<=right && top<=bottom){
            for(int j=left;j<=right;j++)
               mat[top][j]=val++;
            top++;
            for(int i=top;i<=bottom;i++)
               mat[i][right]=val++;
            right--;
            if(top<=bottom){
            for(int j=right;j>=left;j--)
               mat[bottom][j]=val++;
            bottom--;
            }
            if(left<=right){
            for(int i=bottom;i>=top;i--)
               mat[i][left]=val++;
            left++;
            }
            
        }
    return mat;
    }
}
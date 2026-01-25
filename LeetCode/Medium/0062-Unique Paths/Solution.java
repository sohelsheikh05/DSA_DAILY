//BOTTOM UP

class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++) dp[i][0]=1;
        for(int i=1;i<n;i++) dp[0][i]=1;
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
    return dp[m-1][n-1];
    }
}

//Recursion +memoization

// class Solution {
//     public int uniquePaths(int m, int n) {
//            int dp[][]=new int[m][n];
//         for(int i=0;i<m;i++) Arrays.fill(dp[i],-1);
//         return solve(m,n,0,0,dp);
//     }
//     int solve(int m,int n,int i, int j,int dp[][]){
//         if(i==m-1 && j==n-1){
//             return 1;
//         }
//         if(i>= m || i<0 || j>=n || j<0) return 0;
//         if(dp[i][j]!=-1) return dp[i][j];
//         int right=solve(m,n,i,j+1,dp);
//         int down=solve(m,n,i+1,j,dp);
//         return dp[i][j]=right+down;
//     }
// }
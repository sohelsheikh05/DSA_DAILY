class Solution {
    
    int mod=1000000007;
    public int maxProductPath(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        long dp[][][]=new long[m][n][2];
        dp[0][0][0]=dp[0][0][1]=grid[0][0];
        for(int i=1;i<m;i++){
            dp[i][0][0]=dp[i-1][0][0]*grid[i][0];
            dp[i][0][1]=dp[i-1][0][1]*grid[i][0];
        }
        for(int i=1;i<n;i++){
            dp[0][i][0]=dp[0][i-1][0]*grid[0][i];
            dp[0][i][1]=dp[0][i-1][1]*grid[0][i];
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                long a=grid[i][j]*dp[i-1][j][0];
                long c=grid[i][j]*dp[i][j-1][0];
                long b=grid[i][j]*dp[i-1][j][1];
                long d=grid[i][j]*dp[i][j-1][1];
                dp[i][j][0]=Math.min(Math.min(a,b),Math.min(c,d));
                dp[i][j][1]=Math.max(Math.max(a,b),Math.max(c,d));
            } 
        }
    return dp[m-1][n-1][1]>=0?(int)(dp[m-1][n-1][1]%mod):-1;
    }
    
}
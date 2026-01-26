class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int m=dungeon.length;
        int n=dungeon[0].length;
        int dp[][]=new int[m][n];
        dp[0][0]=dungeon[0][0];
        for(int i=0;i<m;i++) Arrays.fill(dp[i],Integer.MAX_VALUE);
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(i==m-1 && j==n-1){
                    dp[i][j]=Math.max(-1*dungeon[i][j]+1,1);
                }
                else if(i==m-1){
                    dp[i][j]=Math.max(-dungeon[i][j]+dp[i][j+1],1);
                }
                else if(j==n-1){
                    dp[i][j]=Math.max(-dungeon[i][j]+dp[i+1][j],1);
                }
                else {
                    dp[i][j]=Math.max(Math.min(dp[i+1][j],dp[i][j+1])-dungeon[i][j],1);
                    }
            }
        }
    System.out.println(Arrays.deepToString(dp));
    return dp[0][0];
    }
}
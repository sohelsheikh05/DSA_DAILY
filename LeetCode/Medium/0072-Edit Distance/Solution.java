class Solution {
    public int minDistance(String word1, String word2) {
        if(word1.equals(word2))
         return 0;
        int n=word1.length();
        int m=word2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=i;
        }
        for(int i=0;i<=m;i++){
            dp[0][i]=i;
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(word1.charAt(i)==word2.charAt(j)){
                      dp[i+1][j+1]=dp[i][j];
                }
                else{
                    dp[i+1][j+1]=Math.min(dp[i][j],Math.min(dp[i+1][j],dp[i][j+1]))+1;
                }
            }
        }
        // if(n==m) return n-dp[n][m];      
        // System.out.println(Arrays.deepToString(dp));
   
    return dp[n][m];
    }
}
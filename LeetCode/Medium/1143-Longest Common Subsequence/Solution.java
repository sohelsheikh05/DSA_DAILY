class Solution {
    int m,n;
    public int longestCommonSubsequence(String text1, String text2) {
         m=text1.length();
         n=text2.length();
        int dp[][]=new int[m+1][n+1];
        //for solve1
        // for(int i=0;i<=m;i++){
        //     Arrays.fill(dp[i],-1);
        // }

        return solve2(text1,text2,dp); //solve1(text1,text2,0,0,dp)
    }
    //Recursion +Memoization
    int solve1(String text1, String text2,int i,int j,int dp[][]){
          if(i>=m || j>=n) return 0;
          if(dp[i][j]!=-1) return dp[i][j];
          if(text1.charAt(i)==text2.charAt(j)) 
             return 1+solve1(text1,text2,i+1,j+1,dp);
          return dp[i][j]=Math.max(solve1(text1,text2,i,j+1,dp),solve1(text1,text2,i+1,j,dp));

    }

    //Bottom Up
    int solve2(String text1, String text2,int dp[][]){
        
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1))
                  dp[i][j]=dp[i-1][j-1]+1;
                else
                  dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
    return dp[m][n];
    }
}
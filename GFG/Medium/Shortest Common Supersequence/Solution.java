class Solution {
    static  int m,n;
     
    public static int minSuperSeq(String s1, String s2) {
        // code here
        m=s1.length();
        n=s2.length();
        int dp[][]=new int[m+1][n+1];
        int common= solve2(s1,s2,dp);
        return m+n-common;
    }
    static int solve2(String text1, String text2,int dp[][]){
        
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


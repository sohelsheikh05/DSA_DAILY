
// //Recursion+Memoization
// class Solution {
//     public int longestPalindromeSubseq(String s) {
//         int n=s.length();
//         int dp[][]=new int[n][n];
//         for(int i=0;i<n;i++) Arrays.fill(dp[i],-1);
//     return lps(s,0,n-1,dp);
//     }
//     int lps(String s,int i,int j,int dp[][]){
//         if(i>j) return 0;
//         if(i==j){
//             return 1;
//         }
//         if(dp[i][j]!=-1) return dp[i][j];
//         if(s.charAt(i)==s.charAt(j))
//           dp[i][j]=2+lps(s,i+1,j-1,dp);
//         else{
//         dp[i][j]=Math.max(lps(s,i+1,j,dp),lps(s,i,j-1,dp));
//         }
//     return dp[i][j];
//     }
// }


class Solution {
    public int longestPalindromeSubseq(String s) {
        int n=s.length();
        int dp[][]=new int[n][n];
        for(int i=0;i<n;i++) dp[i][i]=1;
        
        for(int l=2;l<=n;l++){
            for(int i=0;i+l-1<n;i++){
                int j=i+l-1;
                 if(s.charAt(i)==s.charAt(j) ){
                    dp[i][j]=2+dp[i+1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i+1][j],dp[i][j-1]);
                }
            }
        }
    return dp[0][n-1];
    }
}
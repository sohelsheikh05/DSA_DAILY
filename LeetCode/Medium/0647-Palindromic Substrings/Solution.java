
//By recursion+memoization
class Solution {
    // int dp[][];
    // public int countSubstrings(String s) {
    //     int n=s.length(),count=0;
    //      dp=new int[n][n];
    //      for(int i=0;i<n;i++)
    //       Arrays.fill(dp[i],-1);
    //     for(int i=0;i<n;i++){
    //         for(int j=i;j<n;j++){
    //             if(isPalindrome(i,j,s)){
                  
    //               count++;
    //               }
    //         }
    //     }
    // return count;
    // }
    // boolean isPalindrome(int i,int j,String s){
    //     if(i>j) return true;
    //     if(dp[i][j]!=-1) return dp[i][j]==1;
    //     boolean check=false;
    //     if(s.charAt(i)==s.charAt(j)){
    //        check=isPalindrome(i+1,j-1,s);
    //     }
    //     dp[i][j]=check?1:0;
    //    return dp[i][j]==1;
    // }
    
    //bottom up
    public int countSubstrings(String s){
        int n=s.length(),count=0;
        boolean dp[][]=new boolean[n][n];
        for(int l=1;l<=n;l++){
            for(int i=0;i+l-1<n;i++ ){
                int j=i+l-1;
                if(i==j) dp[i][j]=true;
                else if(i+1==j){
                    dp[i][j]=s.charAt(i)==s.charAt(j);
                }
                else{
                    dp[i][j]=(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]);
                }
                if(dp[i][j])
                 count++;
            }
        }
    return count;
    }
}



class Solution {
    int n,m;
    public int minimumDeleteSum(String s1, String s2) {
         n=s1.length();
         m=s2.length();
        int dp[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int  j=0;j<n;j++){
                char ch=s1.charAt(i);
                char ch1=s2.charAt(j);
                if(ch=ch1)
                 dp[i]=dp[i]
            }
        }

    return solve(0,0,dp,s1,s2);
    }
    int solveByRecursion(int i,int j,int dp[][],String s1, String s2){
        if(i==n){
            int res=0;
            while(j<m){
                res+=(int)s2.charAt(j);
                j++;
            }
          return res;
        }
         if(j==m){
            int res=0;
            while(i<n){
                res+=(int)s1.charAt(i);
                i++;
            }
          return res;
        }
         
         if(dp[i][j]!=-1) 
          return dp[i][j];
        char ch=s1.charAt(i);
        char ch1=s2.charAt(j);

        if(ch==ch1)
         return dp[i][j]=solve(i+1,j+1,dp,s1,s2);
        
        int first=(int)ch+solve(i+1,j,dp,s1,s2);
        int second=(int)ch1+solve(i,j+1,dp,s1,s2);
       return dp[i][j]=Math.min(first,second);

    }
}
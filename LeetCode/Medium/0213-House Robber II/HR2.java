class HR2 {
    int mod=1000000007;
    public int numOfArrays(int n, int m, int k) {
        int dp[][][]=new int[51][101][51];
        for(int i=0;i<=100;i++){
            for(int j=0;j<=50;j++){
                for(int x=0;x<=50;x++)
                  dp[j][i][x]=-1;
            }
        }
      return solve(n,m,k,dp,0,0,0);
    }
    int solve(int n,int m, int k,int dp[][][],int ind,int max,int sc){
        if(ind==n){
            if(sc==k) return 1;
            return 0;
        }
        int result=0;
        if(dp[ind][max][sc]!=-1) return dp[ind][max][sc];
        for(int i=1;i<=m;i++){
            if(i>max){
                result=(result+(solve(n,m,k,dp,ind+1,i,sc+1))%mod)%mod;
            }
            else
                result=(result+(solve(n,m,k,dp,ind+1,max,sc))%mod)%mod;
        }
     return dp[ind][max][sc]=result;
    }
}
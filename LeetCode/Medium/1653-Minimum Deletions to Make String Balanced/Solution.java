class Solution {
    public int minimumDeletions(String s) {
        int n=s.length();
        int dp[][]=new int[n][2];
        for(int i=0;i<n;i++) Arrays.fill(dp[i],-1);
        return solve(s,0,false,dp);
    }
    int solve(String s,int curr,boolean isb,int dp[][]){
       if(curr==s.length()) return 0;
       int b=0;
       if(isb) b=1;
       if(dp[curr][b]!=-1) return dp[curr][b];
       char ch=s.charAt(curr);
       int count =Integer.MAX_VALUE;

       if(ch=='a' ){
        if(!isb)
        count=solve(s,curr+1,isb,dp);
        else
         count=1+solve(s,curr+1,isb,dp);
       }
       else {
        count = Math.min(
                solve(s, curr + 1, true, dp),                 // keep 'b'
                1 + solve(s, curr + 1, isb, dp)                // delete 'b'
            );
       }
    //    System.out.println(curr+" "+b+" "+count);
    return dp[curr][b]=count ;
    }
}
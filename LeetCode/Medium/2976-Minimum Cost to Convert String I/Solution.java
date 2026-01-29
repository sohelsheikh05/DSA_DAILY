class Solution {
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        int n=original.length;
        long dp[][]=new long[26][26];
        for(int i=0;i<26;i++) Arrays.fill(dp[i],Long.MAX_VALUE);
        for(int i=0;i<n;i++){
            int src=original[i]-'a';
            int dest=changed[i]-'a';
            dp[src][dest]=Math.min(dp[src][dest],(long)cost[i]);
            
        }
        //  System.out.println(Arrays.deepToString(dp));
        for(int i=0;i<26;i++){
            for(int row=0;row<26;row++){
                for(int col=0;col<26;col++){
                    if(dp[row][i]!=Long.MAX_VALUE && dp[i][col]!=Long.MAX_VALUE)
                      dp[row][col]=Math.min(dp[row][col],dp[row][i]+dp[i][col]);

                    //   System.out.println(dp[row][col]);
                }
            }
        }
        long ans=0;
        for(int i=0;i<source.length();i++){
            int src=source.charAt(i)-'a';
            int dest=target.charAt(i)-'a';
            if(src!=dest){
                if(dp[src][dest]==Long.MAX_VALUE) return -1;
                ans+=dp[src][dest];
            }
            
        }
        // System.out.println(Arrays.deepToString(dp));
    return ans;
    }
}
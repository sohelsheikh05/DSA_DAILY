class Solution {
    public String longestPalindrome(String s) {
         int n=s.length(),count=0;
        boolean dp[][]=new boolean[n][n];
        int maxlen=1;
        int pos=0;
        for(int i=0;i<n;i++) dp[i][i]=true;
        for(int l=2;l<=n;l++){
            for(int i=0;i+l-1<n;i++ ){
                int j=i+l-1;
                if(s.charAt(i)==s.charAt(j) && l==2){
                    dp[i][j]=true;
                    maxlen=2;
                    pos=i;
                }
                else if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]){

                    dp[i][j]=true;
                    if(j-i+1>maxlen){
                    maxlen=j-i+1;
                    pos=i;
                    }
                }
                else{
                    dp[i][j]=false;

                }
                
            }
        }
    return s.substring(pos,pos+maxlen);
    }
}
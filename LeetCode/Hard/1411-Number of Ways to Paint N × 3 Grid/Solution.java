import java.util.*;
class Solution {
    int mod=1000000007;
    public int numOfWays(int n) {
      ArrayList<String> states=new ArrayList<>();
      
      generateStates(states,"",-1);
      int l=states.size();
      int dp[][]=new int[n][l];
      for(int i=0;i<n;i++)
      Arrays.fill(dp[i],-1);
        int res=0;
        for(int i=0;i<l;i++){
            dp[0][i]=count(states,i,1,n,dp,l);
            res=(res+dp[0][i]%mod)%mod;
            
            }
        return res;   
        }
    int count( ArrayList<String> states,int prev,int row,int n, int dp[][],int l){
         if(row==n){
           System.out.println(prev+" "+row);
            return 1;
           }
        if(dp[row][prev]!=-1) return dp[row][prev];
        int res=0;

         for(int i=0;i<states.size();i++){
           if(i==prev) continue;
           String p=states.get(prev);
           String curr=states.get(i);
           boolean valid=true;
           for(int k=0;k<3;k++){
                if(p.charAt(k)==curr.charAt(k)){
                    valid=false;
                    break;
                }
           }
           if(valid){
            res=(res+count(states,i,row+1,n,dp,l)%mod)%mod;
           }
         }
    return dp[row][prev]=res;
    }
   
    void generateStates(ArrayList<String> states,String curr,int prev){
           if(curr.length()==3){
             states.add(curr);
             return ;
           }
           
           for(char ch:new char[]{'R','G','B'}){
               if(prev!=-1 && curr.charAt(prev)==ch) continue;
                   generateStates(states,curr+ch,prev+1);
           }
    }
}
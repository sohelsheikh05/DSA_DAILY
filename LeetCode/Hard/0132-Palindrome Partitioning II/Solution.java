//Recursion Time Complexity(O(n^2)*(n+n)) gives TLE

// class Solution {
//     public int minCut(String s) {
//         int n=s.length();
//         int dp[][]=new int[n][n];
//         for(int i=0;i<n;i++){
//             Arrays.fill(dp[i],-1);
//         }
//     return solve(s,0,n-1,dp);
//     }
//     int solve(String s,int i,int j,int dp[][]){
//         if(i>=j) return 0;
//         if(dp[i][j]!=-1) return dp[i][j];
//         if(isPalindrome(s,i,j)) return dp[i][j]=0;
//         int min=Integer.MAX_VALUE;
//         for(int k=i;k<j;k++){
//          int temp=1+solve(s,i,k,dp)+solve(s,k+1,j,dp);
//          min=Math.min(min,temp);
//         }
//     return dp[i][j]=min;
//     }
//     boolean isPalindrome(String s,int left,int right){
//         while(left<right){
//             if(s.charAt(left)!=s.charAt(right)) return false;
//             left++;
//             right--;
//         }
//     return true;
//     }
// }



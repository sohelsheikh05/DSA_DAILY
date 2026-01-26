
//Bottom Up
class Solution {
    int dp[][];
    public int maxCollectedFruits(int[][] fruits) {
        int sum=0;
        int n=fruits.length;
        dp=new int[n][n];
        for(int i=0;i<n;i++){
            sum+=fruits[i][i];
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i<j && i+j<n-1){
                    dp[i][j]=0;
                }
                else if(i>j && i+j<n-1){
                    dp[i][j]=0;
                }
                else{
                    dp[i][j]=fruits[i][j];
                }
            }
        }

        for(int i=1;i<n;i++){
            for(int j=i+1;j<n;j++){
                dp[i][j]+=Math.max(dp[i-1][j-1],Math.max(dp[i-1][j],(j+1<n)?dp[i-1][j+1]:0));
            }
        }
        for(int j=1;j<n;j++){
            for(int i=j+1;i<n;i++){
                dp[i][j]+=Math.max(dp[i-1][j-1],Math.max(dp[i][j-1],(i+1<n)?dp[i+1][j-1]:0));
            }
        }
    return sum+dp[n-2][n-1]+dp[n-1][n-2];
    }
    //Recursion +Memoization 
    // public int maxCollectedFruits(int[][] fruits) {
    //     int sum=0;
    //     int n=fruits.length;
    //     dp=new int[n][n];
    //     for(int i=0;i<n;i++) {sum+=fruits[i][i];
    //     Arrays.fill(dp[i],-1);
    //     }
    //     // System.out.println(sum);
    //     sum+=solve(fruits,0,n-1,1,n);
    //     // System.out.println(sum);
    //     sum+=solve(fruits,n-1,0,0,n);
    //     // System.out.println(Arrays.deepToString(dp));
    // return sum;
    // }
    // int solve(int fruits[][],int i,int j,int s,int n){
    //     if(i==n-1 && j==n-1) return 0;
    //     if(s==1 && i>=j) return 0;
    //     if(s==0 && i<=j) return 0;
    //     if(i>=n || i<0 || j>=n || j<0 ) return 0;
    //     if(dp[i][j]!=-1) return dp[i][j];
    //     int max=0;
    //     if(s==1){
    //         int first=solve(fruits,i+1,j-1,1,n);
    //         int second=solve(fruits,i+1,j,1,n);
    //         int third=solve(fruits,i+1,j+1,1,n);
    //         max=Math.max(first,Math.max(second,third));
    //     }
    //     else{
    //         int first=solve(fruits,i-1,j+1,0,n);
    //         int second=solve(fruits,i,j+1,0,n);
    //         int third=solve(fruits,i+1,j+1,0,n);
    //         max=Math.max(first,Math.max(second,third));
    //     }
    // return dp[i][j]=max+fruits[i][j];
    // }
}
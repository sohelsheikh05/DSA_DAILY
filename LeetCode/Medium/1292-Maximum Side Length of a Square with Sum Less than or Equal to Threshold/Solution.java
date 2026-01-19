class Solution {
    public int maxSideLength(int[][] mat, int threshold) {
        int n=mat.length;
        int m=mat[0].length;
        int prefix[][]=new int[n][m];
        for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
            prefix[i][j]=mat[i][j];
           }
        }
        for(int i=0;i<n;i++) {
           for(int j=1;j<m;j++)
             prefix[i][j]+=prefix[i][j-1];
        }
        for(int i=1;i<n;i++) {
           for(int j=0;j<m;j++)
             prefix[i][j]+=prefix[i-1][j];
        }

        int left=1,right=Math.min(n,m);
        int ans=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(isValid(prefix,mid,threshold)){
                ans=mid;
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
    return ans;
    }
    boolean isValid(int prefix[][],int k,int threshold){
            int n=prefix.length;
            int m=prefix[0].length;
            for(int i=k-1;i<n;i++){
                for(int j=k-1;j<m;j++){
                    int x1=i-k+1;
                    int y1=j-k+1;
                    int ans=prefix[i][j];
                    if(x1>0) ans-=prefix[x1-1][j];
                    if(y1>0) ans-=prefix[i][y1-1];
                    if(x1>0 && y1>0) ans+=prefix[x1-1][y1-1];

                    if(ans<=threshold)
                     return true;
                }
            }

        return false;
    }
}
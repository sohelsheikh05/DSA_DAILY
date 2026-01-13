class Solution {
    public double separateSquares(int[][] squares) {
        double total=0;
        double left=Double.MAX_VALUE,right=-Double.MAX_VALUE;
        for(int t[]:squares){
            total+=(double) t[2] * t[2];
            left=Math.min(t[1],left);
            right=Math.max(right,t[1]+t[2]);
        }
        double ans=0;
     
        while(right-left>1e-5){
            double mid=left+(right-left)/2.0;
           
            if(isPossible(total,mid,squares)){
               ans=mid;
               right=mid;
            }
            else{
                left=mid;
            }
        }
    return ans;
    }
    boolean isPossible(double total,double y,int[][] squares){
          double sum=0;
         for(int t[]:squares){
            if(t[1]+t[2]<=y){
                sum+=(double)t[2]*t[2];
            }
            else if(y>t[1]){
                sum+=(double)t[2]*(y-t[1]);
            }
         }
         
    return sum>=total/2.0;
    }
}
class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int count=0;
        long sum=0;
        int n=matrix.length;
        
        int ming=Integer.MAX_VALUE;
        for(int i=0;i<n ;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]>=0){
                    
                    sum+=matrix[i][j];
                    ming=Math.min(ming, matrix[i][j]);
                }
                else{
                    count++;
                    int ele=0-matrix[i][j];
                    
                    ming=Math.min(ming, ele);
                    sum+=ele;
                }
        
            }
        }
     
    if((count & 1)==1)
      sum-=2*ming;
    return sum;
    }
}
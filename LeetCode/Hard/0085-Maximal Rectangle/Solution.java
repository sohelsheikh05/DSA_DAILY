class Solution {
    int max=Integer.MIN_VALUE;
    public int maximalRectangle(char[][] matrix) {
        int rows=matrix.length;
        int col=matrix[0].length;
        int last[]=new int[col];
        for(int i=0;i<rows;i++){
            int next[]=new int[col];
            for(int j=0;j<col;j++){
              if(matrix[i][j]=='1'){
                next[j]=last[j]+1;
                // System.out.println(j);
                }
              }
            // System.out.println(Arrays.toString(next));
           largestRectangleArea(next);
           last=next; 
        }
    return max;
    }
    public void largestRectangleArea(int[] heights) {
        Stack<Integer> stack=new Stack<>();
        stack.push(-1);
       for(int right=0;right<heights.length;right++){
          while(stack.peek()!=-1 && heights[stack.peek()]>heights[right]){
            int height=heights[stack.pop()];
            int width=right-stack.peek()-1;
            max=Math.max(max,height*width);
          }
          stack.push(right);
       }
       int n=heights.length;
       while(stack.peek()!=-1 ){
          int height=heights[stack.pop()];
            int width=n-stack.peek()-1;
            max=Math.max(max,height*width);
       }
    
    }
}
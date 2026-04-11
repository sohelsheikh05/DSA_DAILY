class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack=new Stack<>();
        int max=0;
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
    return max;
    }
}
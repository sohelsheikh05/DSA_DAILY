class Solution {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue=new ArrayDeque<>();
        queue.offer(root);
        int level=1;
        int minlevel=1;
        long max=Integer.MIN_VALUE;
        while(!queue.isEmpty()){
            int size=queue.size();
            long sum=0;
            for(int i=0;i<size;i++){
               TreeNode temp=queue.poll();
               sum+=temp.val;
               if(temp.left!=null) queue.offer(temp.left);
               if(temp.right!=null) queue.offer(temp.right);
            }
            if(sum>max){
                max=sum;
                minlevel=level;
            }
            level++;
        }
    return minlevel;
    }
}
class Solution {
    long total = 0;
    long max = 0;
    int mod = 1000000007;

    public int maxProduct(TreeNode root) {
        total = treeSum(root);    
        dfs(root);                 
        return (int)(max % mod);
    }

   
    long treeSum(TreeNode node) {
        if (node == null) return 0;
        return node.val + treeSum(node.left) + treeSum(node.right);
    }

   
    long dfs(TreeNode node) {
        if (node == null) return 0;

        long left = dfs(node.left);
        long right = dfs(node.right);

        long sub = node.val + left + right;

     
        max = Math.max(max, sub * (total - sub));

        return sub;
    }
}

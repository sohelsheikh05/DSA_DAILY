/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    ArrayList<Integer> list=new ArrayList<>();
    
    public TreeNode balanceBST(TreeNode root) {
        Inorder(root);
        TreeNode res=Build(0,list.size()-1);
      return res;
    }
    void Inorder(TreeNode root){
        if(root==null){
            return ;
        }
        Inorder(root.left);
        list.add(root.val);
        Inorder(root.right);
    }
    TreeNode Build(int l,int r){
        if(l>r) return null;
        int mid=l+(r-l)/2;
        TreeNode res=new TreeNode(list.get(mid));
        res.left=Build(l,mid-1);
        res.right=Build(mid+1,r);
        return  res;
    }
}
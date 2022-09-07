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
    StringBuilder sb = new StringBuilder();
    public String tree2str(TreeNode root) {
        if(root == null){
            return "";
        }
        preOrder(root);
        return sb.toString();
    }
    public void preOrder(TreeNode root){
        sb.append(root.val);
        if(root.left != null){
            sb.append("(");
            preOrder(root.left);
            sb.append(")");
        }else if(root.right != null){
            sb.append("()");
        }
        if(root.right != null){
            sb.append("(");
            preOrder(root.right);
            sb.append(")");
        }
    }
}
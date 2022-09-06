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
    public TreeNode pruneTree(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode n1 = pruneTree(root.left);
        TreeNode n2 = pruneTree(root.right);
        if(root.val == 0 && n1 == null && n2 == null){
            return null;
        }
        root.left = n1;
        root.right = n2;
        return root;
    }
}
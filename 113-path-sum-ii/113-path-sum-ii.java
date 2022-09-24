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
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root == null){
            return res;
        }
        helper(root , new ArrayList<>() , targetSum);
        return res;
    }
    public void helper(TreeNode root , List<Integer> path , int targetSum){
        if(root != null){
            if(targetSum == root.val && root.left == null && root.right == null){
                path.add(root.val);
                res.add(new ArrayList<>(path));
            }else{
                path.add(root.val);
                helper(root.left , path , targetSum - root.val);
                helper(root.right , path , targetSum - root.val);
            }
            path.remove(path.size() - 1);
        }
    }
}
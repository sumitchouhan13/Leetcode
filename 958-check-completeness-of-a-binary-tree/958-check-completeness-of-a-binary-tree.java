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
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0 ; i < size ; i++){
                TreeNode temp = q.poll();
                if(temp.left != null){
                    q.offer(temp.left);
                }else{
                    if(temp.right != null){
                        return false;
                    }
                }
                if(temp.right != null){
                    q.offer(temp.right);
                }else{
                    if(q.peek()!=null && (q.peek().left!=null || q.peek().right!=null))
                        return false;
                }
            }
        }
        return true;
    }
}
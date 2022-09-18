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
    public TreeNode reverseOddLevels(TreeNode root) {
        if(root == null){
            return root;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int level = 0;
        while(!q.isEmpty()){
            int n = q.size();
            TreeNode[] nodes = new TreeNode[n];
            for(int i = 0 ; i < n ; i++){
                TreeNode temp = q.poll();
                nodes[i] = temp;
                if(temp.left != null){
                    q.offer(temp.left);
                }
                if(temp.right != null){
                    q.offer(temp.right);
                }
            }
            if(level % 2 != 0){
                reverse(nodes);
            }
            level++;
        }
        return root;
    }
    private void reverse(TreeNode[] nodes){
        int i = 0 , j = nodes.length - 1;
        while(i <= j){
            int temp = nodes[i].val;
            nodes[i].val = nodes[j].val;
            nodes[j].val = temp;
            i++;
            j--;
        }
    }
}
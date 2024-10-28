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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        while(!queue.isEmpty()){
            int n = queue.size();
            int preVal = (level % 2 == 0) ? 
                                Integer.MIN_VALUE : Integer.MAX_VALUE; 
            for(int i = 0; i < n; i++){
                TreeNode temp = queue.remove();
                if(level % 2 == 0){
                    if(temp.val % 2 == 0 || temp.val <= preVal){
                        return false;
                    }
                }
                if(level % 2 != 0){
                    if(temp.val % 2 != 0 || temp.val >= preVal){
                        return false;
                    }
                }
                if(temp.left != null){
                    queue.add(temp.left);
                }
                if(temp.right != null){
                    queue.add(temp.right);
                }
                preVal = temp.val;
            }
            level++;
        }
        return true;
    }
}
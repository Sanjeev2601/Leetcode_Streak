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
        if(root == null){
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean seeNull = false;
        while(!queue.isEmpty()){
            TreeNode temp = queue.remove();
            if(temp == null){
                seeNull = true;
            }
            else{
                if(seeNull == true){
                    return false;
                }
                queue.add(temp.left);
                queue.add(temp.right);
            }
        }
        return true;
    }
}
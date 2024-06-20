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
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int lc = maxDepth(root.left);
        int rc = maxDepth(root.right);
        return Math.max(lc,rc) + 1;
    //     Queue<TreeNode> q = new LinkedList<>();
    //     q.add(root);
    //     int depth = 0;
    //     while(!q.isEmpty()){
    //         int n = q.size();
    //         for(int i = 0; i < n; i++){
    //             TreeNode temp = q.remove();
    //             if(temp.left != null){
    //                 q.add(temp.left);
    //             }
    //             if(temp.right != null){
    //                 q.add(temp.right);
    //             }
    //         }
    //         depth++;
    //     }
    //     return depth;
    }
}
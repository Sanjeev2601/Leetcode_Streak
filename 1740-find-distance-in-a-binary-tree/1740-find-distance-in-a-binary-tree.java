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
    private int findDistanceHelper(TreeNode root, int p, int q, int depth) {
        if(root == null || p == q){
            return 0;
        }
        if(root.val == p || root.val == q){
            int left = findDistanceHelper(root.left, p, q, 1);
            int right = findDistanceHelper(root.right, p, q, 1);
            return (left > 0 || right > 0) ? Math.max(left, right) : depth;
        }
        int left = findDistanceHelper(root.left, p, q, depth + 1);
        int right = findDistanceHelper(root.right, p, q, depth + 1);
        int ans = left + right;
        if(left != 0 && right != 0){
            ans -= 2 * depth;
        }
        return ans;
    }
    public int findDistance(TreeNode root, int p, int q) {
        return findDistanceHelper(root, p, q, 0);
    }
}
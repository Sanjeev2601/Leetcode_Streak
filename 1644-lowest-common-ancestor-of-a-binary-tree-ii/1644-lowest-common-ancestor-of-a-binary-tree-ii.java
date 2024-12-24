/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private boolean nodeExists(TreeNode root, TreeNode x){
        if(root == null){
            return false;
        }
        if(root == x){
            return true;
        }
        return nodeExists(root.left, x) || nodeExists(root.right, x);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode ans = lowestCommonAncestorHelper(root, p, q);
        if(ans == p){
            return nodeExists(root, q) ? ans : null;
        }
        else if(ans == q){
            return nodeExists(root, p) ? ans : null;
        }
        return ans;
    }
    public TreeNode lowestCommonAncestorHelper(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q){
            return root;
        }
        TreeNode left = lowestCommonAncestorHelper(root.left, p, q);
        TreeNode right = lowestCommonAncestorHelper(root.right, p, q);
        if(left != null && right != null){
            return root;
        }
        return left != null ? left : right;
    }
}
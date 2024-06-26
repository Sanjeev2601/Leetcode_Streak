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
    public TreeNode convertBST(TreeNode root) {
        int[] a = new int[1];
        convertBSTHelper(root, a);
        return root;
    }
    public void convertBSTHelper(TreeNode root, int[] a){
        if(root == null){
            return;
        }
        convertBSTHelper(root.right, a);
        a[0] += root.val;
        root.val = a[0];
        convertBSTHelper(root.left, a);
    }
}
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
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        TreeNode sucessor = null;
        while(root != null) {
            if(p.val >= root.val) {
                root = root.right;
            }
            else {
                sucessor = root;
                root = root.left;
            }
        }
        return sucessor;
    }
}
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
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        inorderTraversal(root, inorder);
        return createBalancedBST(inorder, 0, inorder.size() - 1);
    }
    public void inorderTraversal(TreeNode root, List<Integer> inorder){
        if(root == null){
            return;
        }
        inorderTraversal(root.left, inorder);
        inorder.add(root.val);
        inorderTraversal(root.right, inorder);
    }
    public TreeNode createBalancedBST(List<Integer> inorder, int start, int end){
        if(start > end){
            return null;
        }
        int mid = start + (end - start) / 2;
        TreeNode left = createBalancedBST(inorder, start, mid - 1);
        TreeNode right = createBalancedBST(inorder, mid + 1, end);
        TreeNode node = new TreeNode(
            inorder.get(mid),
            left,
            right
        );
        return node;
    }
}
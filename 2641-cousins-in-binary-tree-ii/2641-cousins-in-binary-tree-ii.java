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
    public TreeNode replaceValueInTree(TreeNode root) {
        if(root == null){
            return root;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int previousLevelSum = root.val;
        while(!q.isEmpty()){
            int n = q.size();
            int currentLevelSum = 0;
            for(int i = 0; i < n; i++){
                TreeNode temp = q.remove();
                temp.val = previousLevelSum - temp.val;
                int siblingSum = (temp.left != null ? temp.left.val : 0) +
                    (temp.right != null ? temp.right.val : 0);
                if(temp.left != null){
                    currentLevelSum += temp.left.val;
                    temp.left.val = siblingSum;
                    q.add(temp.left);
                }
                if(temp.right != null){
                    currentLevelSum += temp.right.val;
                    temp.right.val = siblingSum;
                    q.add(temp.right);
                }
            }
            previousLevelSum = currentLevelSum;
        }
        return root;
    }
}
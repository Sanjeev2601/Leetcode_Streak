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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null){
            return true;
        } 
        if (p == null || q == null){
            return false;
        }
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        q1.add(p);
        q2.add(q);
        while(!q1.isEmpty() && !q2.isEmpty()){
            int n1 = q1.size();
            int n2 = q2.size();
            if (n1 != n2){
                return false;
            }
            for(int i = 0; i < n1; i++){
                TreeNode temp1 = q1.remove();
                TreeNode temp2 = q2.remove();
                if (temp1.val != temp2.val){
                    return false;
                }
                if ((temp1.left == null) != (temp2.left == null)){
                    return false;
                }
                if ((temp1.right == null) != (temp2.right == null)){
                    return false;
                }
                if(temp1.left != null){
                    q1.add(temp1.left);
                }
                if(temp1.right != null){
                    q1.add(temp1.right);
                }
                if(temp2.left != null){
                    q2.add(temp2.left);
                }
                if(temp2.right != null){
                    q2.add(temp2.right);
                }
            }
        }
        return q1.isEmpty();
    }
}
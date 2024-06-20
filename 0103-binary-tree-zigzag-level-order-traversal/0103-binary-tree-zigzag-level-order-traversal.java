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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null){
            return ans;
        }
        q.add(root);
        int counter = 1;
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> levelAns = new ArrayList<>();
            for(int i = 0; i < n; i++){
                TreeNode temp = q.remove(); 
                levelAns.add(temp.val);
                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }
            }
            if(counter == -1){
                Collections.reverse(levelAns);
            }
            counter *= -1;
            ans.add(levelAns);
        }
        return ans;
    }
}
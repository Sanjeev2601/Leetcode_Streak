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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();
        Stack<TreeNode> s = new Stack<>();
        if(root == null){
            return ans;
        }
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> levelAns = new ArrayList<>();
            for(int i = 0; i < n; i++){
                TreeNode temp = q.remove();
                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }
                levelAns.add(temp.val);
            }
            ans.add(levelAns);
        }
        Collections.reverse(ans);
        return ans;
    }
}
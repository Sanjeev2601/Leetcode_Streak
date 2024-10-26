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
    private int height(TreeNode node, Map<TreeNode, Integer> hm){
        if (node == null){
            return -1;
        }
        if(hm.containsKey(node)){
            return hm.get(node);
        }
        int h = 1 + Math.max(height(node.left, hm), height(node.right, hm));
        hm.put(node, h);
        return h;
    }
    private void dfs(TreeNode node,
        int depth, int maxVal,
        Map<Integer, Integer> result,
        Map<TreeNode, Integer> hm){
            if(node == null){
                return;
            }
            result.put(node.val, maxVal);
            int leftHeight = node.left != null ? hm.get(node.left) : -1;
        int rightHeight = node.right != null ? hm.get(node.right) : -1;
            dfs(node.left, depth + 1, 
                Math.max(maxVal, depth + 1 + rightHeight),
                result, hm);
            dfs(node.right, depth + 1,
                Math.max(maxVal, depth + 1 + leftHeight),
                result, hm);
        }
    public int[] treeQueries(TreeNode root, int[] queries) {
        Map<Integer, Integer> result = new HashMap<>();
        Map<TreeNode, Integer> hm = new HashMap<>();
        height(root, hm);
        dfs(root, 0, 0, result, hm);
        int[] res = new int[queries.length];
        for(int i = 0; i < queries.length; i++){
            res[i] = result.get(queries[i]);
        }
        return res;
    }
}
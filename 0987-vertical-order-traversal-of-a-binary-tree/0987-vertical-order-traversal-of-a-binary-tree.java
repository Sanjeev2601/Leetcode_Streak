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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        TreeMap<Integer, List<Integer>> hm = new TreeMap<>();
        Queue<Pair<TreeNode, Integer>> queue = new LinkedList<>();
        Map<TreeNode, Integer> rowMap = new HashMap<>();
        queue.add(new Pair(root, 0));
        rowMap.put(root, 0);
        while(!queue.isEmpty()){
            int n = queue.size();
            Map<Integer, List<Integer>> tempMap = new HashMap<>();
            for(int i = 0; i < n; i++){
                Pair<TreeNode, Integer> p = queue.remove();
                TreeNode temp = p.getKey();
                int col = p.getValue();
                int row = rowMap.get(temp);
                if(!tempMap.containsKey(col)){
                    tempMap.put(col, new ArrayList<>());
                }
                tempMap.get(col).add(temp.val);
                if(temp.left != null){
                    queue.add(new Pair(temp.left, col - 1));
                    rowMap.put(temp.left, row + 1);
                }
                if(temp.right != null){
                    queue.add(new Pair(temp.right, col + 1));
                    rowMap.put(temp.right, row + 1);
                }
            }
            for(Map.Entry<Integer, List<Integer>> entry : tempMap.entrySet()){
                int column = entry.getKey();
                List<Integer> values = entry.getValue();
                Collections.sort(values);
                if(!hm.containsKey(column)){
                    hm.put(column, new ArrayList<>());
                }
                hm.get(column).addAll(values); 
            }
        }     
        for(List<Integer> values : hm.values()){
            ans.add(values);
        }
        return ans;
    }
}
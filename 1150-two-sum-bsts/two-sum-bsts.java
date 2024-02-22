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
    public boolean twoSumBSTs(TreeNode root1, TreeNode root2, int target) {
        Set<Integer> hs = new HashSet<>();
        if(root1 == null){
            return false;
        }
        addRoot1(root1, hs);
        return find(root2, target, hs);
    }
    public void addRoot1(TreeNode root1, Set<Integer> hs){
        hs.add(root1.val);
        if(root1.left != null){
            addRoot1(root1.left, hs);
        }
        if(root1.right != null){
            addRoot1(root1.right, hs);
        }
    }
    public boolean find(TreeNode root2, int target, Set<Integer> hs){
        if(root2 == null){
            return false;
        }
        if(hs.contains(target - root2.val)){
            return true;
        }
        return find(root2.left, target, hs) || find(root2.right, target, hs);
    }
}
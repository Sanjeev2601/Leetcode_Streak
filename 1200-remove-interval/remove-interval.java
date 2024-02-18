class Solution {
    public List<List<Integer>> removeInterval(int[][] intervals, int[] toBeRemoved) {
        int start = toBeRemoved[0];
        int end = toBeRemoved[1];
        List<List<Integer>> ans = new ArrayList<>();
        for (int[] val : intervals) {
            if (val[0] < start) {
                ans.add(List.of(val[0], Math.min(val[1], start)));
            }
            if (val[1] > end) {
                ans.add(List.of(Math.max(val[0], end), val[1]));
            }
        }
        return ans;
    }
}
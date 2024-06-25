class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int[] arr : dp){
            Arrays.fill(arr, -1);
        }
        return minPathSumHelper(grid, m - 1, n - 1, dp);
    }
    public int minPathSumHelper(int[][] grid, int m, int n, int[][] dp) {
        if(m < 0 || n < 0){
            return Integer.MAX_VALUE;
        }
        if(m == 0 && n == 0){
            return grid[0][0];
        }
        if(dp[m][n] != -1){
            return dp[m][n];
        }
        int x = minPathSumHelper(grid, m - 1, n, dp);
        int y = minPathSumHelper(grid, m, n - 1, dp);
        dp[m][n] = Math.min(x, y) + grid[m][n];
        return dp[m][n];
    }
}
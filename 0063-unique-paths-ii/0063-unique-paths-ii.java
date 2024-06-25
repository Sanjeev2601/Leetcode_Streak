class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for(int[] arr : dp){
            Arrays.fill(arr, -1);
        }
        return uniquePathsWithObstaclesHelper(m - 1, n - 1, dp, obstacleGrid);
    }
    public int uniquePathsWithObstaclesHelper(int m, int n, int[][] dp, int[][] obstacleGrid) {
        if(m < 0 || n < 0 || (obstacleGrid[m][n] == 1)){
            return 0;
        }
        if(m == 0 && n == 0){
            return 1;
        }
        if(dp[m][n] != -1){
            return dp[m][n];
        }
        int x = uniquePathsWithObstaclesHelper(m - 1, n, dp, obstacleGrid);
        int y = uniquePathsWithObstaclesHelper(m, n - 1, dp, obstacleGrid);
        dp[m][n] = x + y;
        return x + y;
    }
}
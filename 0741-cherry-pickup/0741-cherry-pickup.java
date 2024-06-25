class Solution {
    public int cherryPickup(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][][] dp = new int[m][n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        int result = cherryPickupHelper(grid, 0, 0, 0, dp);  
        return result < 0 ? 0 : result;
    }
    public int cherryPickupHelper(int[][] grid, int row1, int row2, int col1, int[][][]dp) {
        int m = grid.length;
        int n = grid[0].length;
        int col2 = row1 + col1 - row2;
        if(row1 >= m || row2 >= m || col1 >= n || col2 >= n){
            return Integer.MIN_VALUE;
        }
        if(grid[row1][col1] == -1 || grid[row2][col2] == -1){
            return Integer.MIN_VALUE;
        }
        if (row1 == m - 1 && col1 == n - 1) {
            return grid[row1][col1];
        }
        if(dp[row1][col1][row2] != -1){
            return dp[row1][col1][row2];
        }
        int temp1 = cherryPickupHelper(grid, row1 + 1, row2, col1, dp);
        int temp2 = cherryPickupHelper(grid, row1 + 1, row2 + 1, col1, dp);
        int temp3 = cherryPickupHelper(grid, row1, row2 + 1, col1 + 1, dp);
        int temp4 = cherryPickupHelper(grid, row1, row2, col1 + 1, dp);
        int max = Math.max(temp1, Math.max(temp2, Math.max(temp3, temp4)));
        int x = 0;
        if(row1 == row2 && col1 == col2){
            x = grid[row1][col1];
        }
        else{
            x = grid[row1][col1] + grid[row2][col2];
        }
        dp[row1][col1][row2] = max + x;
        return dp[row1][col1][row2];
    }
}
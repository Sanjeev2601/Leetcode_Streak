class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int[] arr : dp){
            Arrays.fill(arr, -1);
        }
        return uniquePathsHelper(m, n, dp);
    }
    public int uniquePathsHelper(int m, int n, int[][] dp) {
        if((m-1) == 0 || (n-1)  == 0){
            return 1;
        }
        if(dp[m-1][n-1] != -1){
            return dp[m-1][n-1];
        }
        int x = uniquePathsHelper(m-1, n, dp);
        int y = uniquePathsHelper(m, n-1, dp);
        dp[m-1][n-1] = x + y;
        return (x + y);
    }
}
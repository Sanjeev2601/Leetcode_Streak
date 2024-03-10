class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int ans = 0;
        for(int i = 0; i < grid.length - 2; i++){
            for(int j = 0; j < grid[0].length - 2; j++){
                if(checkMS(grid, i, j)){
                    ans++;
                }
            }
        }
        return ans;
    }
    static boolean checkMS(int grid[][], int a, int b){
        int c = a + 2, d = b + 2;
        int ax[] = new int[9];
        for(int i = a; i <= c; i++){
            for(int j = b; j <= d; j++){
                if(grid[i][j] < 10 && grid[i][j] > 0)
                    ax[grid[i][j] - 1]++;
            }
        }
        for(int i = 0; i < 9; i++){
            if(ax[i]==0) 
                return false;
        }
        int sum = grid[a][b] + grid[a][b + 1] + grid[a][d];

        for(int i = a; i <= c; i++){
            int s = grid[i][b] + grid[i][b+1] + grid[i][d];
            if(s != sum) {
                return false;
            }
        }

        for(int j = b; j <= d; j++){
            int s = grid[a][j] + grid[a+1][j] + grid[c][j];
            if(s != sum) {
                return false;
            }
        }

        if(grid[a][b] + grid[a+1][b+1] + grid[c][d] != sum) {
            return false;
        }
        if(grid[a][d] + grid[a+1][b+1] + grid[c][b] != sum) {
            return false;
        }

        return true;
    }
}
class Solution {
    static int ans = 1;
    public int largestMagicSquare(int[][] grid) {
        ans = 1;
        int n = grid.length;
        int m = grid[0].length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int a = Math.min(n-i, m-j);
                for(int k = 2; k <= a; k++){
                    helper(grid, i, j, k);
                }
            }
        }
        return ans;
    }
    static void helper(int grid[][], int a, int b, int c){
        int sum = 0;
        for(int i = a; i < a + c; i++){
            sum += grid[i][b];
        }
        for(int i = a; i < a + c; i++){
            int s = 0;
            for(int j = b; j < b + c; j++){
                 s += grid[i][j];
            }
            if(s != sum) {
                return;
            }
        }
        for(int i = b; i < b + c; i++){
            int s = 0;
            for(int j = a; j < a + c; j++){
                s += grid[j][i];
            }
            if(s != sum) {
                return;
            }
        }

        int d1 = 0, d2 = 0, j1 = a, j2 = b + c - 1, i1= a, i2 = b;

        while(i1 < a + c){
            d1 += grid[i1][i2];
            d2 += grid[j1][j2];
            i1++;
            i2++;
            j1++;
            j2--;
        }  
        if(d1 != sum || d2 != sum){
            return;
        }
        ans = Math.max(ans,c);
    }
}
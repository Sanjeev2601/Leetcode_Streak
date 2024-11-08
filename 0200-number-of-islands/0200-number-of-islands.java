class Solution {
    private int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    // ----------------------------- BFS ---------------------------------
    private void bfs(char[][] grid, boolean[][] visited, int m, int n){
        int row = grid.length;
        int col = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{m, n});
        visited[m][n] = true;
        while(!queue.isEmpty()){
            int[] temp = queue.remove();
            int nr = temp[0];
            int nc = temp[1];
            for(int[] dir : directions){
                int newRow = nr + dir[0];
                int newCol = nc + dir[1];
                if(newRow >= 0 && newRow < row && 
                    newCol >= 0 && newCol < col &&
                    grid[newRow][newCol] == '1' && !visited[newRow][newCol]){
                        queue.add(new int[]{newRow, newCol});
                        visited[newRow][newCol] = true;
                    } 
            }
        }
    }
    public int numIslands(char[][] grid) {
        int m = grid.length;
        if(m == 0){ 
            return 0;
        }
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int ans = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    ans++;
                    bfs(grid, visited, i, j);
                }
            }
        }
        return ans;
    }
    // ----------------------------- DFS ---------------------------------
    // private void dfs(char[][] grid, boolean[][] visited, int m, int n){
    //     int row = grid.length;
    //     int col = grid[0].length;
    //     if (m < 0 || n < 0 || m >= row || n >= col || grid[m][n] == '0' || visited[m][n]) {
    //         return;
    //     }
    //     visited[m][n] = true;
    //     for(int[] dir : directions){
    //         dfs(grid, visited, m + dir[0], n + dir[1]);
    //     }
    // }
    // public int numIslands(char[][] grid) {
    //     int m = grid.length;
    //     if(m == 0){ 
    //         return 0;
    //     }
    //     int n = grid[0].length;
    //     boolean[][] visited = new boolean[m][n];
    //     int ans = 0;
    //     for(int i = 0; i < m; i++){
    //         for(int j = 0; j < n; j++){
    //             if(grid[i][j] == '1' && !visited[i][j]){
    //                 ans++;
    //                 dfs(grid, visited, i, j);
    //             }
    //         }
    //     }
    //     return ans;
    // }
}
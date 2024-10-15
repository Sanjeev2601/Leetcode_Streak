class Solution {
    static class Pair{
		int row;
		int col ; 
		int time;
		Pair(int row, int col, int time){
			this.row = row;
			this.col = col;
			this.time = time;
		}
	}
    public int orangesRotting(int[][] grid) {
        Queue<Pair> q = new LinkedList<>();
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 2){
                    Pair p = new Pair(i, j, 0);
                    q.add(p);
                }
                else if(grid[i][j] == 1){
                    count++;
                }
            }
        }
        if(count == 0){
            return 0;
        }
        int ans = -1;
        while(!q.isEmpty()){
            Pair rem = q.remove();
            int r = rem.row, c = rem.col, t = rem.time;
            ans = t;
            if(r - 1 >= 0 && grid[r - 1][c] == 1){
                q.add(new Pair(r - 1, c, t + 1));
                grid[r - 1][c] = 2;
            }
            if(c - 1 >= 0 && grid[r][c - 1] == 1){
                q.add(new Pair(r, c - 1, t + 1));
                grid[r][c - 1] = 2;
            }
            if(c + 1 < n && grid[r][c + 1] == 1){
                q.add(new Pair(r, c + 1, t + 1));
                grid[r][c + 1] = 2;
            }
            if(r + 1 < m && grid[r + 1][c] == 1){
                q.add(new Pair(r + 1, c, t + 1));
                grid[r + 1][c] = 2;
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1){
                    return -1;
                }
            }
        }
        return ans;
    }
}
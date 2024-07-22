class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int m = mat.length;
        for(int k = 0; k < 4; k++){
        for(int i = 0; i < m; i++){
            for(int j = i; j < m; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for (int i = 0; i < m; i++) {
                int start = 0;
                int end = m - 1;
                while (end > start) {
                    int temp = mat[i][start];
                    mat[i][start] = mat[i][end];
                    mat[i][end] = temp;
                    start++;
                    end--;
                }
            }
            if (Arrays.deepEquals(mat, target)) {
                return true;
            }
        }
        return false;
    }
}
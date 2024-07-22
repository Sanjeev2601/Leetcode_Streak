class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        for (int i = 0; i < m; i++) {
            for (int j = i; j < m; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < m; i++) {
            int[] temp = matrix[i];
            int start = 0;
            int end = m - 1;
            while(start < end){
                int x = temp[start];
                temp[start] = temp[end];
                temp[end] = x;
                start++;
                end--;
            }
            matrix[i] = temp;
        }
        // int[][] ans = new int[m][m];
        // for(int i = 0; i < m; i++){
        //     for(int j = 0; j < m; j++){
        //         ans[i][j] = matrix[m-j-1][i];
        //     }
        // }
        // for(int i = 0; i < m; i++){
        //     for(int j = 0; j < m; j++){
        //         matrix[i][j] = ans[i][j];
        //     }
        // }
    }
}
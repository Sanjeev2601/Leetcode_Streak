class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> hs = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char val = board[i][j];
                if (val != '.') {
                    if (!hs.add(val + " in row " + i) ||
                        !hs.add(val + " in column " + j) ||
                        !hs.add(val + " in subgrid " + i / 3 + "-" + j / 3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
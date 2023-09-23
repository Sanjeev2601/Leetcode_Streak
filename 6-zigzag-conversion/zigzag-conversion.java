class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        int n = s.length();
        char[][] zig = new char[numRows][n];
        int i = 0, toggle = -1, c= 0, r = 0;
        while(i<n){
            if(r == 0 || (r == numRows - 1)){
                toggle *= -1;
            }
            zig[r][c] = s.charAt(i);
            if(toggle == 1){
                r++;
            }
            else if(toggle == -1){
                r--;
                c++;
            }
            i++;
        }
        StringBuilder ans = new StringBuilder();
        for (char[] row: zig) {
            for (char character: row) {
                if (character != '\u0000') {
                    ans.append(character);
                }
            }
        }
        return ans.toString();
    }
}
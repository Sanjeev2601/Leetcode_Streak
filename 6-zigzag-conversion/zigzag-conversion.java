class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        int n = s.length();
        // int numCol = 1;
        // if(n>=numRows){
        //     numCol = (n/numRows) + ((numRows-2)*(n/numRows-1));
        // }
        // if(numRows == 2 && (n % numRows) == (numRows-1)){
        //     numCol++;
        // }
        // else if((n % numRows) == (numRows-2)){
        //     numCol++;
        // }
        char[][] zig = new char[numRows][n];
        int i = 0, toggle = -1, c= 0, r = 0;
        while(i<n){
            if(r == 0 || (r == numRows - 1)){
                toggle *= -1;
            }
            if(toggle == 1){
                zig[r][c] = s.charAt(i);
                r++;
            }
            else if(toggle == -1){
                zig[r][c] = s.charAt(i);
                r--;
                c++;
            }
            i++;
        }
        StringBuilder ans = new StringBuilder();
        for (char[] row: zig) {
            for (char character: row) {
                if (character != ' ' && character != '\u0000') {
                    ans.append(character);
                }
            }
        }
        return ans.toString();
    }
}
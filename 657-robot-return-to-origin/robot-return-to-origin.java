class Solution {
    public boolean judgeCircle(String moves) {
        int sr = 0, sl = 0, su = 0, sd = 0;
        for (int i = 0; i < moves.length(); i++) {
            if(moves.charAt(i)=='R'){
                sr++;
            }
            if(moves.charAt(i)=='L'){
                sl++;
            }
            if(moves.charAt(i)=='U'){
                su++;
            }
            if(moves.charAt(i)=='D'){
                sd++;
            }
        }
        if(sr!=sl || su!=sd){
            return false;
        }
        return true;
    }
}
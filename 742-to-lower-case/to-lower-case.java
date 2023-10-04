class Solution {
    public String toLowerCase(String s) {
        char ch;
        StringBuilder str = new StringBuilder();
        for(int i = 0 ; i < s.length(); i++){
            ch = s.charAt(i);
            if(ch > 64 && ch < 91){
                ch += 32;
            }
            str.append(ch);
        }
        return str.toString();
    }
}
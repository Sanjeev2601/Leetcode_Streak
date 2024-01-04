class Solution {
    public boolean isPalindrome(String s) {
        int p = 0;
        int q = s.length() - 1;
        while(p <= q){
            char x = s.charAt(p);
            char y = s.charAt(q);
            if(!Character.isLetterOrDigit(x)){
                p++;
                continue;
            }
            if(!Character.isLetterOrDigit(y)){
                q--;
                continue;
            }
            if(Character.toLowerCase(x) != Character.toLowerCase(y)){
                return false;
            }
            p++;
            q--;
        }
        return true;
    }
}
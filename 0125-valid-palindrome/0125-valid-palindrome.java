class Solution {
    public boolean isPalindrome(String s) {
        int p = 0;
        int q = s.length() - 1;
        while(p <= q){
            char a = s.charAt(p);
            char b = s.charAt(q);
            if(!Character.isLetterOrDigit(a)){
                p++;
                continue;
            }
            if(!Character.isLetterOrDigit(b)){
                q--;
                continue;
            }
            if(Character.toLowerCase(a) != Character.toLowerCase(b)){
                return false;
            }
            p++;
            q--;
        }
        return true;
    }
}
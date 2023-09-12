class Solution {
    public String shortestPalindrome(String s) {
        int n = s.length();
        if (n <= 1) {
            return s;
        }
        int center = 0;
        for (int right = n - 1; right >= 0; right--) {
            if (s.charAt(center) == s.charAt(right)) {
                center++;
            }
        }
        if (center == n) { // The entire string is a palindrome.
            return s;
        }
        String suffix = s.substring(center,n);
        String prefix = new StringBuilder(suffix).reverse().toString();
        String remaining = s.substring(0, center);
        return prefix + shortestPalindrome(remaining) + suffix;
        //     int len = s.length();
    //     if(len<=1)
    //        return s;
    //     int end = len-1;
    //     while(end>0){
    //         if(isPalindrome(s,0,end)){
    //             break;
    //         }
    //         end--;
    //     }
    //     StringBuilder pre = new StringBuilder(s.substring(end+1,len));
    //     pre.reverse();
    //     return pre + s; 
    // }
    // public boolean isPalindrome(String s, int start, int end){
    //     while(start<end){
    //         if(s.charAt(start)!=s.charAt(end)){
    //             return false;
    //         }
    //         start++;
    //         end--;
    //     }
    //     return true;
    }
}
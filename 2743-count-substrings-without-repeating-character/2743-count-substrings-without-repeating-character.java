class Solution {
    public int numberOfSpecialSubstrings(String s) {
        int count = 0;
        int start = 0;
        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
            while(freq[s.charAt(i) - 'a'] > 1){
                freq[s.charAt(start) - 'a']--;
                start++;
            }
            count += (i - start + 1);
        }
        return count;
    }
}
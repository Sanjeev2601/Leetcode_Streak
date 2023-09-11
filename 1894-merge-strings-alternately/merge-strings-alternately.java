class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length() + word2.length();
        char[] mergedword = new char[n*2];
        int i=0, j=0, k=0;
        while(i<word1.length() || j<word2.length()){
            if (i < word1.length()) {
               mergedword[k++] = word1.charAt(i);
               i++;
            }
            if (j < word2.length()) {
               mergedword[k++] = word2.charAt(j);
               j++;
            }
        }
        return new String(mergedword, 0, k);
    }
}
class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
    HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
    int n = s.length();
    if (n < 3) return n;
    int left = 0, right = 0;
    int max_len = 2;
    while (right < n) {
      hm.put(s.charAt(right), right++);
      if (hm.size() == 3) {
        int del_idx = Collections.min(hm.values());
        hm.remove(s.charAt(del_idx));
        left = del_idx + 1;
      }

      max_len = Math.max(max_len, right - left);
    }
    return max_len;
    }
}
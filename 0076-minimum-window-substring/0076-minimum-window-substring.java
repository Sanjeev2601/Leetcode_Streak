class Solution {
    public String minWindow(String s, String t) {
        int m = s.length();
        int n = t.length();
        if(n > m || n == 0 || m == 0){
            return "";
        }
        Map<Character, Integer> hm = new HashMap<>();
        for(char ch : t.toCharArray()){
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        int index = 0;
        int minLen = m + 1;
        int count = 0;
        int start = 0;
        for(int i = 0; i < m; i++){
            char right = s.charAt(i);
            if(hm.containsKey(right)){
                hm.put(right, hm.get(right) - 1);
                if(hm.get(right) == 0){
                    count++;
                }
            }
            while(count == hm.size()){
                if(minLen > i - start + 1){
                    minLen = i - start + 1;
                    index = start;
                }
                char deleted = s.charAt(start++);
                if(hm.containsKey(deleted)){
                    if(hm.get(deleted) == 0){
                        count--;
                    }
                    hm.put(deleted, hm.get(deleted) + 1);
                }
            }
        }
        return minLen > m ? "" : s.substring(index, index + minLen);
    }
}
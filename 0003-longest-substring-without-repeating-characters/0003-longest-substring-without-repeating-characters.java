class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<Character> subs = new ArrayList<>();
        int ans = 0;
        for(int i = 0; i < s.length(); i++){
            if(subs.contains(s.charAt(i))){
                int index = subs.indexOf(s.charAt(i));
                if(index > 0){
                    subs.subList(0, index).clear();
                }
                subs.remove(0);
            }
            subs.add(s.charAt(i));
            ans = Math.max(ans, subs.size());
        }
        return ans;
    }
}
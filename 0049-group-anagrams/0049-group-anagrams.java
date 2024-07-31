class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();
        for (String str : strs) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String sortedStr = new String(ch);
            if (!ans.containsKey(sortedStr)) {
                ans.put(sortedStr, new ArrayList<>());
            }
            ans.get(sortedStr).add(str);
        }
        return new ArrayList(ans.values());
    }
}
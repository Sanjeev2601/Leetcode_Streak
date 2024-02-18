class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            if (!hm.containsKey(num)) {
                hm.put(num, 1);
            } else {
                hm.put(num, hm.get(num) + 1);
            }
        }
        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 1) {
                ans = entry.getKey();
                break;
            }
        }
        return ans;
    }
}
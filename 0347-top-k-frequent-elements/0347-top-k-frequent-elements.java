class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        List<Integer>[] freqBuckets = new ArrayList[nums.length + 1];
        for (int i = 0; i < freqBuckets.length; i++) {
            freqBuckets[i] = new ArrayList<>();
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            freqBuckets[value].add(key);
        }
        int[] ans = new int[k];
        int count = 0;
        for (int i = nums.length; i > 0 && count < k; i--) {
            if (!freqBuckets[i].isEmpty()) {
                for (int num : freqBuckets[i]) {
                    if (count < k) {
                        ans[count++] = num;
                    } else {
                        break;
                    }
                }
            }
        }
        return ans;
    }
}
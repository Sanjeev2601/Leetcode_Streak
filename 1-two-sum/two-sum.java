class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            hm.put(nums[i],i);
        }
        for (int i = 0; i < len; ++i) {
            int a = nums[i];
            int complement = target - a;
            if (hm.containsKey(complement) && hm.get(complement)!=i) {
                return new int[]{i, hm.get(complement)};
            }
        }
        return new int[]{};
    }
}
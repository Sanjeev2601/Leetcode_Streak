class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        Integer[] arr = new Integer[nums.length];
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        Arrays.sort(arr, (a, b) -> {
            if (hm.get(a).equals(hm.get(b))) {
                return Integer.compare(b, a);
            }
            return Integer.compare(hm.get(a), hm.get(b));
        });
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }
        return nums;
    }
}

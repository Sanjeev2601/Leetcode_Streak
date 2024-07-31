class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        TreeSet<Long> set = new TreeSet<>();
        for(int i = 0; i < nums.length; i++){
            Long floor = set.floor(1L * nums[i] + valueDiff);
            Long ceil = set.ceiling(1L * nums[i] - valueDiff);
            if(floor != null && floor >= nums[i] || ceil != null && ceil <= nums[i]){
                return true;
            }
            set.add(1L * nums[i]);
            if(set.size() > indexDiff){
                set.remove(1L * nums[i - indexDiff]);
            }
        }
        return false;
    }
}

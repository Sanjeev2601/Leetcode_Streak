class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        long maxSum = 0;
        long currentSum = 0;
        int left = 0;
        for(int i = 0; i < k; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
            currentSum += nums[i];
        }
        if(hm.size() == k){
            maxSum = Math.max(maxSum, currentSum);
        }
        for(int i = k; i < nums.length; i++){
            int outgoing = nums[i - k];
            hm.put(outgoing, hm.get(outgoing) - 1);
            currentSum -= outgoing;
            if(hm.get(nums[i - k]) == 0){
                hm.remove(nums[i - k]);
            } 
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
            currentSum += nums[i];   
            if(hm.size() == k){
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }
}
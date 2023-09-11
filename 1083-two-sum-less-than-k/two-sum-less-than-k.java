class Solution {
    public int twoSumLessThanK(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        if(n<2)
           return -1;
        int maxSum = -1;
        for(int i=0;i<n;i++){
            int a = nums[i];
            int complement = k - a;
            int left = i + 1;
            int right = n - 1;
            while (left <= right) {
                int b = nums[left];
                int currentSum = a + b;
                if (currentSum < k) {
                    maxSum = Math.max(maxSum, currentSum); 
                    left++; 
                } else {
                     right--; 
                }
            }
        }
        return maxSum;
    }
}
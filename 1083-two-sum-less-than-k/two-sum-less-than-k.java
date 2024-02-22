class Solution {
    public int twoSumLessThanK(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        if(n<2)
           return -1;
        int maxSum = -1;
        int left = 0;
        int right = n - 1;
        while(left < right){
            int sum = nums[left] + nums[right];
            if(sum >= k){
                right--;
            }
            else{
                left++;
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
}                                                                                             
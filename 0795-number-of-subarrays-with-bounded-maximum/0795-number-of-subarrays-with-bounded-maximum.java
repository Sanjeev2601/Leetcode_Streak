class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int ans = 0;
        int lg = 0;
        int pre = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > right){
                lg = i + 1;
                pre = 0;
            }
            else if(nums[i] >= left & nums[i] <= right){
                ans += (i - lg + 1);
                pre = i - lg + 1;
            }
            else{
                ans += pre;
            }
        }
        return ans;
    }
}

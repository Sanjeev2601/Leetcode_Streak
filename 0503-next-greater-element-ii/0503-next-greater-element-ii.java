class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = 2 * n - 1; i >= 0; i--){
            while(!stack.empty() && nums[i % n] >= nums[stack.peek()]){
                stack.pop();
            }
            ans[i % n] = stack.empty() ? -1 : nums[stack.peek()];
            stack.push(i % n);
        }
        return ans;
    }
}
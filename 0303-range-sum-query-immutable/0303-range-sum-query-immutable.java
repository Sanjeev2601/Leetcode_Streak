class NumArray {
    private int[] pf;
    public NumArray(int[] nums) {
        pf = new int[nums.length];
        pf[0] = nums[0];
        int sum = 0, k = 0;
        for(int i : nums){
            sum += i;
            pf[k++] = sum;
        }
    }
    
    public int sumRange(int left, int right) {
        if(left == 0){
            return pf[right];
        }
        return pf[right] - pf[left - 1]; 
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
class NumArray {
    private int[] nums;
    private int[] a;
    private int n;
    public NumArray(int[] nums) {
        this.nums = nums;
        n = (int) Math.ceil(nums.length / Math.sqrt(nums.length));
        a = new int[n];
        for(int i = 0; i < nums.length; i++){
            a[i / n] += nums[i];
        }
    }

    public void update(int index, int val) {
        a[index / n] = a[index / n] - nums[index] + val;
        nums[index] = val;
    }
    
    public int sumRange(int left, int right) {
        int sum = 0;
        int block1 = left / n;
        int block2 = right / n;
        if(block1 == block2){
            for(int i = left; i <= right; i++){
                sum += nums[i];
            }
        }
        else{
            for(int i = left; i <= (block1 + 1) * n - 1; i++){
                sum += nums[i];
            }
            for(int i = block1 + 1; i <= block2 - 1; i++){
                sum += a[i];
            }
            for(int i = block2 * n; i <= right; i++){
                sum += nums[i];
            }
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */
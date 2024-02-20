class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int start = 0, end = n - 1;
        if(n == 1){
            return nums[0];
        }
        while(start < end){
            int mid = start + (end - start) / 2;
            if((mid % 2) != 0){
                mid--;
            }
            if(nums[mid] == nums[mid + 1]) {
                start = mid + 2; 
            }
            else{
                end = mid; 
            }
        }
        return nums[start];
    }
}
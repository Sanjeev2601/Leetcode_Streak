class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int start = 0, end = n - 1;
        if(n == 1){
            return 0;
        }
        else if(n == 2){
            if(nums[start] > nums [end]){
                return start;
            }
            else{
                return end;
            }
        }
        while(start <= end){
            int mid = start + (end - start) / 2;
            if((mid == 0 || nums[mid] > nums[mid - 1]) && (mid == n - 1 || nums[mid] > nums[mid + 1])){
                return mid;
            }
            if(mid > 0 && nums[mid - 1] > nums[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return 0;
    }
}
class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int start = 0, end = n - 1;
        if(n == 1){
            return nums[0];
        }
        while(start <= end){
            int mid = start + (end - start) / 2;
            int next = (mid + 1) % n;
            int prev = (mid + n - 1) % n;
            if((nums[mid] < nums[prev]) && (nums[mid] < nums[next])){
                return nums[mid];
            }
            if(nums[start] <= nums[mid]){
                if(nums[start] < nums[end]){
                    end = mid - 1;
                } 
                else{
                    start = mid + 1;
                }
            }
            else{
                end = mid - 1; 
            }
        }
        return -1;
    }
}
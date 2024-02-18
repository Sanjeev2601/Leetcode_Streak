class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int ans = 0;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target == nums[mid]){
                ans = mid;
                break;
            }
            else if(target < nums[mid]){
                end = mid - 1;
                ans = -1; 
            }
            else{
                start = mid + 1;
                ans = -1;
            }
        } 
        if(ans == -1){
            ans = Math.min(start,end) + 1;
        }
        return ans;  
    }
}
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int occ1 = -1, occ2 = -1; 
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target == nums[mid]){
                occ1 = mid;
                end = mid - 1;
            }
            else if(target < nums[mid]){
                end = mid - 1; 
            }
            else{
                start = mid + 1;
            }
        } 
        start = 0;
        end = nums.length - 1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target == nums[mid]){
                occ2 = mid;
                start = mid + 1;
            }
            else if(target < nums[mid]){
                end = mid - 1; 
            }
            else{
                start = mid + 1;
            }
        } 
        return new int[]{occ1, occ2};
    }
}
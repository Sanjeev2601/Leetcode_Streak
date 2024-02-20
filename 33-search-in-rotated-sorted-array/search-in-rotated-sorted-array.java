class Solution {
    public int binarySearch(int [] nums, int start, int end, int target){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == nums[mid]){
                return mid;
            }
            else if(target < nums[mid]){
                end = mid - 1; 
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int n = nums.length;
        int start = 0, end = n - 1;
        int index = 0;
        while (start <= end) {
            if (nums[start] <= nums[end]) { 
                index = start;
                break;
            }
            int mid = start + (end - start) / 2;
            int next = (mid + 1) % n;
            int prev = (mid + n -1) % n;
            if((nums[mid] <= nums[next]) && (nums[mid] <= nums[prev])){
                index = mid;
                break;
            }
            if(nums[start] <= nums[mid]){
                start = mid + 1;
            }
            else if(nums[mid] <= nums[end]){
                end = mid - 1;
            }
        }  
        return Math.max((binarySearch(nums, 0, index - 1, target)),(binarySearch(nums, index, n - 1, target)));  
    }
}

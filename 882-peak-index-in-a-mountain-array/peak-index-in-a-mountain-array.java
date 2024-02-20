class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int start = 0, end = n - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if((mid == 0 || arr[mid - 1] < arr[mid]) && (mid == n - 1 || arr[mid + 1] < arr[mid])){
                return mid;
            }
            if(mid > 0 && (arr[mid - 1] > arr[mid])){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        } 
        return -1;
    }
}
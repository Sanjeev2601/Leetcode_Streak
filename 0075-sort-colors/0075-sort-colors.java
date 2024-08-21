class Solution {
    public void sortColors(int[] nums) {
        int i = 0;
        int right = nums.length - 1;
        int j = 0;
        int temp;
        while( j <= right){
            if(nums[j] == 0){
                temp = nums[i];
                nums[i++] = nums[j];
                nums[j++] = temp;
            }
            else if(nums[j] == 1){
                j++;
            }
            else{
                temp = nums[j];
                nums[j] = nums[right];
                nums[right--] = temp;
            }
        }
    }
}
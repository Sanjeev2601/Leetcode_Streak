class Solution {
    public boolean canSortArray(int[] nums) {
        int prevMax = Integer.MIN_VALUE;
        int currMin = nums[0], currMax = nums[0];
        int val = Integer.bitCount(nums[0]);
        for(int i = 1; i < nums.length; i++){
            if(Integer.bitCount(nums[i]) == val){
                currMin = Math.min(currMin, nums[i]);
                currMax = Math.max(currMax, nums[i]);
                continue;
            }
            if(currMin < prevMax){
                return false;
            }
            prevMax = currMax;
            currMin = nums[i];
            currMax = nums[i];
            val = Integer.bitCount(nums[i]);
        }
        if(currMin < prevMax){
            return false;
        }
        return true;
    }
    // private int findSetBits(int num){
    //     int setBit = 0;
    //     for(int i = 0; i < 31; i++){
    //         if((num&(1 << i)) != 0){
    //             setBit++;
    //         }
    //     }
    //     return setBit;
    // }
}
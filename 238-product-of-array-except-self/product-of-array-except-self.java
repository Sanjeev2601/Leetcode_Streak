class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                product *= nums[i];
            } else {
                count++;
            }
        }
        if(count > 1){
            for(int i=0;i<nums.length;i++) {
                nums[i] = 0;
            }
        }
        else if(count > 0){
            for(int i=0;i<nums.length;i++){
                if(nums[i] != 0){
                    nums[i] = 0;
                }
                else{
                    nums[i] = product;
                }
            }
        }
        else{
            for(int i=0;i<nums.length;i++){
                nums[i] = product / nums[i];
            }
        }
        return nums;
    }
}
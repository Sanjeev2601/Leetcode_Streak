class Solution {
    public int majorityElement(int[] nums) {
        int val = nums[0], freq = 1;
        for(int i = 1; i < nums.length; i++){
            if(freq == 0){
                val = nums[i];
                freq++;
                continue;
            }
            if(val == nums[i]){
                freq++;
            }
            else{
                freq--;     
            }
        }
        return val;
    }
}
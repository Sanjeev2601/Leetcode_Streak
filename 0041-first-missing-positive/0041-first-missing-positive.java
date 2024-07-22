class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0; 
        while(i < nums.length){
            if(nums[i] == i+1 || nums[i] <= 0 || nums[i] > nums.length){
                i++;
            }
            else{
                int idx1 = i;
                int idx2 = nums[i] - 1;
                if(nums[i] == nums[idx2]){
                    i++;
                    continue;
                }
                int temp = nums[idx1];
                nums[idx1] = nums[idx2];
                nums[idx2] = temp; 
            }
        }
        for(int j = 0; j < nums.length; j++){
            if(j + 1 != nums[j]){
                return j + 1;
            }
        }
        return nums.length + 1;
        // Set<Integer> hs = new HashSet<>();
        // for(int i : nums){
        //     hs.add(i);
        // }
        // for(int i = 1; i <= nums.length; i++){
        //     if(!hs.contains(i)){
        //         return i;
        //     }
        // }
        // return nums.length + 1;
    }
}
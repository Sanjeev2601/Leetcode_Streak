class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < nums.length && nums[i] <= 0; ++i){
            if(i == 0 || nums[i - 1] != nums[i]){
                threeSum(nums, i, ans);
            }
        }
        return ans;
    }
    void threeSum(int[] nums, int i, List<List<Integer>> ans){
        int s = i + 1, e = nums.length - 1;
        while(s < e){
            int sum = nums[i] + nums[s] + nums[e];
            if(sum < 0){
                ++s;
            }
            else if(sum > 0){
                --e;
            }
            else{
                ans.add(Arrays.asList(nums[i], nums[s], nums[e]));
                s++;
                e--;
                while (s < e && nums[s] == nums[s - 1]){
                    ++s;
                }
            }
        }
    }
}
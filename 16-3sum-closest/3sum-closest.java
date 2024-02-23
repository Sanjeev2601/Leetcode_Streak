class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < n && ans != 0; i++){
            int start = i + 1, end = n - 1;
            while(start < end){
                int sum = nums[i] + nums[start] + nums[end];
                if(Math.abs(ans) > Math.abs(target - sum)){
                    ans = target - sum;
                }
                if(sum > target){
                    end--;
                }
                else{
                    start++;
                }
            }
        }
        return target - ans;
    }
}

// for(int i = 0; i < n - 2; i++){
        //     if(i == 0 || nums[i - 1] != nums[i]){
        //         int cs = threeSum(nums, i, target);
        //         if(Math.abs(cs - target) < Math.abs(ans - target))
        //             ans = cs;
        //     }
        // }
    // public int threeSum(int[] nums, int i, int target){
    //     int start = i + 1, end = nums.length - 1;
    //     int check = nums[i] + nums[start] + nums[end];
    //     while(start < end){
    //         int sum = nums[i] + nums[start] + nums[end];
    //         if(sum == target){
    //             return sum;
    //         }
    //         else if(sum > target){
    //             end--;
    //         }
    //         else{                
    //             start++;
    //         }
    //         if(Math.abs(target - sum) < Math.abs(target - check)){
    //             check = sum;
    //         } 
    //     }        
    //     return check;
    // }


class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = nums[0] + nums[1] + nums[2];
        for(int i = 0; i < n - 2; i++){
            if(i == 0 || nums[i - 1] != nums[i]){
                int cs = threeSum(nums, i, target);
                if(Math.abs(cs - target) < Math.abs(ans - target))
                    ans = cs;
            }
        }
        return ans;
    }
    public int threeSum(int[] nums, int i, int target){
        int start = i + 1, end = nums.length - 1;
        int check = nums[i] + nums[start] + nums[end];
        while(start < end){
            int sum = nums[i] + nums[start] + nums[end];
            if(sum == target){
                return sum;
            }
            else if(sum > target){
                end--;
            }
            else{                
                start++;
            }
            if(Math.abs(target - sum) < Math.abs(target - check)){
                check = sum;
            } 
        }        
        return check;
    }
}

// import java.util.Arrays;

// class Solution {
//     public int threeSumClosest(int[] nums, int target) {
//         Arrays.sort(nums);
//         int n = nums.length;
//         int ans = nums[0] + nums[1] + nums[2]; 
//         for (int i = 0; i < n - 2; i++) {
//             if (i == 0 || nums[i] != nums[i - 1]) {
//                 int closestSum = threeSum(nums, i, target);
//                 if (Math.abs(closestSum - target) < Math.abs(ans - target)) {
//                     ans = closestSum;
//                 }
//             }
//         }
//         return ans;
//     }

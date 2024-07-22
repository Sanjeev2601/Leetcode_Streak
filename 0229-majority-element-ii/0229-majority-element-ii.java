class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int val1 = nums[0], val2 = nums[0], count1 = 1, count2 = 0; 
        for(int i = 1; i < nums.length; i++){
            if(val1 == nums[i]){
                count1++;
            }
            else if(val2 == nums[i]){
                count2++;
            }
            else if(count1 == 0){
                val1 = nums[i];
                count1++;
            }
            else if(count2 == 0){
                val2 = nums[i];
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        int check1 = 0, check2 = 0;
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(val1 == nums[i]){
                check1++;
            }
            else if(val2 == nums[i]){
                check2++;
            }
        }
        if(check1 > nums.length/3){
            ans.add(val1);
        }
        if(check2 > nums.length/3){
            ans.add(val2);
        }
        return ans;
    }
}
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0, count = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++)
        {
            if(val == nums[i])
            {    
                k++;
                count++;
            }
            else{
                nums[i - k] = nums[i];
            }
        }
        return n - count;
        
    }
}
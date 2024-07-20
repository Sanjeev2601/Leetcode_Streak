class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int pf[] = new int[n];
        int sum = 0;
        int k = 0;
        for(int i : nums){
            sum += i;
            pf[k++] = sum;
        }
        if(0 == pf[n - 1] - pf[0]){
            return 0;
        }
        for(int i = 1; i < n; i++){
            int leftSum = pf[i-1];
            int rightSum = pf[n - 1] - pf[i];
            if(leftSum == rightSum){
                return i;
            }
        }
        if(0 == pf[n - 2]){
            return n - 1;
        }
        return -1;
    }
}
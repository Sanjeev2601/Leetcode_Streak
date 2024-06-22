class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        Queue<Integer> q = new LinkedList<>();
        int count = 0;
        int lastPop = -1, initialGap = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 1){
                q.add(i);
            }
            if(q.size() > k){
                lastPop = q.remove();
            }
            if(q.size() == k){
                initialGap = q.peek() - lastPop;
                count += initialGap;
            }
        }
        return count;
    }
}
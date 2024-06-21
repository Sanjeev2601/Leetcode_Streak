class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> h = new PriorityQueue<>();
        for(int i = 0; i < k; i++){
            h.add(nums[i]);
        }
        for(int i = k; i < nums.length; i++){
            if(nums[i] > h.peek()){
                h.remove();
                h.add(nums[i]);
            }
        }
        return h.peek();
    }
}
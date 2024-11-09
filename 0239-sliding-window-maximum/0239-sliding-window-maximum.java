class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i = 0; i < k; i++){
            while(deque.size() > 0 && deque.getLast() < nums[i]){
                deque.removeLast();
            }
            deque.addLast(nums[i]);
        }
        ans[0] = deque.getFirst();
        for(int i = k; i < n; i++){
            while(deque.size() > 0 && deque.getLast() < nums[i]){
                deque.removeLast();
            }
            deque.addLast(nums[i]);
            if(nums[i - k] == deque.getFirst()){
                deque.removeFirst();
            }
            ans[i - k + 1] = deque.getFirst();
        }
        return ans;
    }
}
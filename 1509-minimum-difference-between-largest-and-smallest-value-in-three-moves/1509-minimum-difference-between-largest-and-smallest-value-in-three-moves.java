class Solution {
    public int minDifference(int[] nums) {
        int n = nums.length;
        if(n <= 4){
            return 0;
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : nums) {
            maxHeap.add(num);
            if(maxHeap.size() > 4){
                maxHeap.remove();
            }
        }
        List<Integer> smallestFour = new ArrayList<>(maxHeap);
        Collections.sort(smallestFour);
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int num : nums) {
            minHeap.add(num);
            if(minHeap.size() > 4){
                minHeap.remove();
            }
        }
        List<Integer> largestFour = new ArrayList<>(minHeap);
        int minDiff = Integer.MAX_VALUE;
        Collections.sort(largestFour);
        for(int i = 0; i < 4; i++){
            minDiff = Math.min(
                minDiff,
                largestFour.get(i) - smallestFour.get(i)
            );
        }
        return minDiff;
    }
}
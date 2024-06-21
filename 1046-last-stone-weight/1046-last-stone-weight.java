class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> h = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : stones){
            h.add(i);
        }
        while(h.size() > 1){
            int temp = h.remove();
            temp -= h.remove();
            if(temp != 0){
                h.add(temp);
            }
        }
        if(h.size() == 0){
            return 0;
        }
        return h.remove();
    }
}
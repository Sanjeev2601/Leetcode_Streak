class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i : nums){
            int temp = hm.getOrDefault(i,0);
            count += temp;
            hm.put(i,temp+1); 
        }
        return count;
    }
}
class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i : nums){
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        int ans = 0;
        for(int i : nums){
            if(hm.get(i) == 1){
                ans += i;
            }
        }
        return ans;
    }
}
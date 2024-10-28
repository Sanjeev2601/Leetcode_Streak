class Solution {
    public int longestSquareStreak(int[] nums) {
        int ans = 0;
        Set<Integer> hs = new HashSet<>();
        for(int num : nums){
            hs.add(num);
        }
        for(int i : nums){
            int currentStreak = 0;
            long val = i;
            while(hs.contains((int)val)){
                currentStreak++;
                if(val * val > 1e5){
                    break;
                }
                val *= val;
            }
            ans = Math.max(ans, currentStreak);
        }
        return ans < 2 ? -1 : ans;
    }
}
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        for(int i : nums)
            hs.add(i);
        int seq = 0;
        for(int num : hs){
            if(!hs.contains(num - 1)){
                int currentNum = num;
                int currentStreak = 1;
                while(hs.contains(currentNum + 1)){
                    currentNum += 1;
                    currentStreak += 1;
                }
                seq = Math.max(seq, currentStreak);
            }
        }
        return seq;
    }
}
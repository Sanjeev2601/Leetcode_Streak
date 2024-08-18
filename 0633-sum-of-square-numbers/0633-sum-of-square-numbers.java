class Solution {
    public boolean judgeSquareSum(int c) {
        int high = (int) Math.sqrt(c);
        Set<Integer> hs = new HashSet<>();
        for(int i = 0; i <= high; i++){
            hs.add(i * i);
        }
        for(int i = 0; i <= high; i++){
            int val = c - (i * i);
            if(hs.contains(val)){
                return true;
            }
        }
        return false;
    }
}
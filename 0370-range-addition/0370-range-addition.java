class Solution {
    public int[] getModifiedArray(int length, int[][] updates) {
        int[] ans = new int[length];
        for(int i = 0; i < updates.length; i++){
            int start = updates[i][0];
            int end = updates[i][1];
            int inc = updates[i][2];
            ans[start] += inc;
            if(end + 1 < length){
                ans[end + 1] -= inc;
            }
        }
        for(int i = 1; i < length; i++){
            ans[i] = ans[i - 1] + ans[i];
        }
        return ans;
    }
}

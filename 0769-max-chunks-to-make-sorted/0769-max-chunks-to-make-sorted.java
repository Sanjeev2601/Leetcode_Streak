class Solution {
    public int maxChunksToSorted(int[] arr) {
        int counter = Integer.MIN_VALUE;
        int ans = 0;
        for(int i = 0; i < arr.length; i++){
            counter = Math.max(counter, arr[i]);
            if(i == counter){
                ans++;
            }
        }
        return ans;
    }
}

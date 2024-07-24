class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        if(n == 0 || n == 1){
            return n;
        }
        int[] pmax = new int[n];
        int[] smin = new int[n];
        int ans = 0;
        pmax[0] = arr[0];
        smin[n - 1] = arr[n - 1];
        for(int i = 1; i < n; i++){
            pmax[i] = Math.max(pmax[i - 1], arr[i]);
        }
        for(int i = n - 2; i >= 0; i--){
            smin[i] = Math.min(smin[i + 1], arr[i]);
        }
        for(int i = 0; i < n - 1; i++){
            if(pmax[i] <= smin[i + 1]){
                ans++;
            }
        }
        ans++;
        return ans;
    }
}

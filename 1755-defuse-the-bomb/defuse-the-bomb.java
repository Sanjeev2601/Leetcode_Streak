class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int res[] = new int[n];
        if(k == 0){
            for(int i = 0; i < n; i++){
                res[i] = 0;
            }
        }
        int start = 1, end = k;
        if(k < 0)
        {
            k *= -1;
            start = n-k;
            end = n-1;
        }
        int sum = 0;
        for(int i = start; i <= end; i++)
            sum += code[i];
        for(int i = 0; i < n; i++)
        {
            res[i] = sum;
            sum -= code[(start++) % n];
            sum += code[(++end) % n];
        }
        return res;
    }
}
class Solution {
    public int maximumSwap(int num) {
        StringBuilder s = new StringBuilder(Integer.toString(num));
        int n = s.length();
        int[] maxIndex = new int[n];
        maxIndex[n - 1] = n - 1;
        for(int i = n - 2; i >= 0; i--){
            maxIndex[i] = s.charAt(i) > s.charAt(maxIndex[i + 1]) ? i : maxIndex[i + 1];
        }
        for(int i = 0; i < n - 1; i++){
            if(s.charAt(i) < s.charAt(maxIndex[i])){
                int temp = s.charAt(i) - '0';
                s.replace(i, i + 1, String.valueOf(s.charAt(maxIndex[i])));
                s.replace(maxIndex[i], maxIndex[i] + 1, String.valueOf(temp));
                break;
            }
        }   
        return Integer.parseInt(s.toString());
    }
}
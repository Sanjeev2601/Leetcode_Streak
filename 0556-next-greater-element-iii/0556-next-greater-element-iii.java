class Solution {
    public int nextGreaterElement(int n) {
        char[] ch = (n + "").toCharArray();
        int idx = -1;
        for(int i = ch.length - 2; i >= 0; i--){
            if(ch[i] < ch[i + 1]){
                idx = i;
                break;
            }
        }
        if(idx == -1){
            return -1;
        }
        int small = idx + 1;
        for(int i = idx + 1; i < ch.length; i++){
            if(ch[i] > ch[idx] && ch[i] < ch[small]){
                small = i;
            }
        }
        char temp = ch[small];
        ch[small] = ch[idx];
        ch[idx] = temp;
        Arrays.sort(ch, idx + 1, ch.length);
        long ans = Long.parseLong(new String(ch));
        if(ans > Integer.MAX_VALUE){
            return -1;
        }
        return (int)ans;
    }
}
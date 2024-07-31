class Solution {
    private static final int MOD = 1000000007;
    public int countAnagrams(String s) {
        String[] words = s.split(" ");
        long ans = 1;
        for(String word : words){
            ans = ( ans * countWord(word)) % MOD;
        }
        return (int) ans;
    }
    public int countWord(String word){
        int n = word.length();
        long val = factorial(n);
        Map<Character, Long> hm = new HashMap<>();
        for(char c : word.toCharArray()){
            hm.put(c, hm.getOrDefault(c, 0L) + 1);
        }   
        for(long i : hm.values()){
            val = (val * modInverse(factorial((int) i), MOD)) % MOD;
        }
        return (int) val;
    }
    public long factorial(int n){
        long result = 1;
        for(int i = 2; i <= n; i++){
            result = (result * i) % MOD;
        }
        return result;
    }
    private long modPow(long x, long y, long p) {
        long res = 1;
        x = x % p;
        while (y > 0) {
            if ((y & 1) == 1) {
                res = (res * x) % p;
            }
            y = y >> 1;
            x = (x * x) % p;
        }
        return res;
    }
    private long modInverse(long a, long p) {
        return modPow(a, p - 2, p);
    }
}
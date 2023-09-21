class Solution {
    public int reverse(int x) {
        int temp = x;
        int rem, val = 0;
        while(temp!=0){
            rem = temp % 10;
            if (val > Integer.MAX_VALUE/10) 
                return 0;
            if (val < Integer.MIN_VALUE/10) 
                return 0;
            val = val * 10 + rem;
            temp = temp / 10;
        }
        return val;
    }
}
class Solution {
    public boolean isArmstrong(int n) {
        int rem, temp = n;
        int check = 0;
        int digit = String.valueOf(n).length();
        while(temp > 0){
            rem = temp % 10;
            check += Math.pow(rem, digit);
            temp /= 10;
        }
        return (check == n);
    }
}
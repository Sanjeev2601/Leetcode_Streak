class Solution {
    public boolean isArmstrong(int n) {
        int rem, temp = n;
        int check = 0, digit = 0;
        while(temp > 0){
            digit++;
            temp /= 10;
        }
        temp = n;
        while(temp > 0){
            rem = temp % 10;
            check += Math.pow(rem, digit);
            temp /= 10;
        }
        return (check == n);
    }
}
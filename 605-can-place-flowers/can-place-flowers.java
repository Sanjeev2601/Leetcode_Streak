class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int a = flowerbed.length;
        int i = 0;
        while (i < flowerbed.length) {
            if (flowerbed[i] == 0) {
                int next = (i == flowerbed.length - 1) ? 0 : flowerbed[i + 1];
                int prev = (i == 0) ? 0 : flowerbed[i - 1];
                if (prev == 0 && next == 0) {
                    flowerbed[i] = 1; 
                    count++;
                }
            }
            i++;
        }
        return count >= n;
    }
}
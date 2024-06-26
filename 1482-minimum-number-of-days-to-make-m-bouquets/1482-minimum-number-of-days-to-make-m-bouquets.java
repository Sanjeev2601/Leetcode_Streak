class Solution {
    private int getNumOfBouquets(int[] bloomDay, int mid, int k){
        int numOfBouquets = 0;
        int count = 0;
        for(int i = 0; i < bloomDay.length; i++){
            if(bloomDay[i] <= mid){
                count++;
            }
            else{
                count = 0;
            }
            if(count == k){
                numOfBouquets++;
                count = 0;
            }
        }
        return numOfBouquets;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int start = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;
        for (int day : bloomDay) {
            start = Math.min(start, day);
            end = Math.max(end, day);
        }
        int minDays = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (getNumOfBouquets(bloomDay, mid, k) >= m) {
                minDays = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return minDays;
    }
}
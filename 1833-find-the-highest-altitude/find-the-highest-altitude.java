class Solution {
    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int sum = 0;
        for (int i = 0; i < gain.length; i++)
        {
            sum += gain[i];
            altitude = Math.max(altitude, sum);
        }
        return altitude;
    }
}
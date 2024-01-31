class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int sum1 = 0;
        int sum2 = 0;
        int n = distance.length;
        if(start == destination){
            return 0;
        }
        int i = start;
        while(i != destination){
            sum1 += distance[i];
            if(i == n-1){
                i = -1;
            }
            i++;
        }
        i = destination;
        while(i != start){
            sum2 += distance[i];
            if(i == n-1){
                i = -1;
            }
            i++;
        }
        return Math.min(sum1, sum2);
    }
}
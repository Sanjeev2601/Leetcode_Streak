class Solution {
    public int maxDistToClosest(int[] seats) {
        int ans = Integer.MIN_VALUE;
        int i = -1;
        for(int j = 0; j < seats.length; j++){
            if(seats[j] == 1){
                if(i == -1){
                    ans = Math.max(ans, j);
                }
                else{
                    ans = Math.max(ans, (j - i) / 2);
                }
                i = j;
            }
        }   
        ans = Math.max(ans, seats.length - 1 - i);
        return ans;
    }
}
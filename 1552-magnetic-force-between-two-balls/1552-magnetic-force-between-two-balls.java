class Solution {
    private boolean canPlaceBalls(int[] position, int m, int x) {
        int prevBallPos = position[0];
        int ballsPlaced = 1;
        for (int i = 1; i < position.length && ballsPlaced < m; ++i) {
            int currPos = position[i];
            if (currPos - prevBallPos >= x) {
                ballsPlaced += 1;
                prevBallPos = currPos;
            }
        }
        return ballsPlaced == m;
    }

    public int maxDistance(int[] position, int m) {
        int answer = 0;
        int n = position.length;
        Arrays.sort(position);
        int low = 1;
        int high = position[n - 1] / (m - 1);
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canPlaceBalls(position, m, mid)) {
                answer = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return answer;
    }
}
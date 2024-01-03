class Solution {
    public int assignBikes(int[][] workers, int[][] bikes) {
        return assignBikes(0, 0, new boolean[bikes.length], workers, bikes);
    }

    public int assignBikes(int workerIndex, int totalDistance, boolean[] bikeUsed, int[][] workers, int[][] bikes) {
        if (workerIndex == workers.length) {
            return totalDistance;
        }

        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < bikes.length; i++) {
            if (!bikeUsed[i]) {
                bikeUsed[i] = true;
                int distance = calculateDistance(workers[workerIndex], bikes[i]);
                minDistance = Math.min(minDistance, assignBikes(workerIndex + 1, totalDistance + distance, bikeUsed, workers, bikes));
                bikeUsed[i] = false;
            }
        }

        return minDistance;
    }

    private int calculateDistance(int[] worker, int[] bike) {
        return Math.abs(worker[0] - bike[0]) + Math.abs(worker[1] - bike[1]);
    }
}

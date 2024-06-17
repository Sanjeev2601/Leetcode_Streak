class Solution {

    public int maxBoxesInWarehouse(int[] boxes, int[] warehouse) {
        int warehouseSize = warehouse.length;
        Arrays.sort(boxes);

        int leftIndex = 0;
        int rightIndex = warehouseSize - 1;
        int boxCount = 0;
        int boxIndex = boxes.length - 1;
        while (leftIndex <= rightIndex && boxIndex >= 0) {
            if (boxes[boxIndex] <= warehouse[leftIndex]) {
                boxCount++;
                leftIndex++;
            } else if (boxes[boxIndex] <= warehouse[rightIndex]) {
                boxCount++;
                rightIndex--;
            }
            boxIndex--;
        }
        return boxCount;
    }
}
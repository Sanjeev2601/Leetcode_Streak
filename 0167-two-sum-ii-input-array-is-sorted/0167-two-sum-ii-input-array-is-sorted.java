class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int start = 0, end = n -1;
        while(start < end){
            if(numbers[start] + numbers[end] == target)
               return new int[]{ start + 1, end + 1 };
            else if(numbers[start] + numbers[end] < target)
               start++;
            else
               end--;
        }
        return new int[]{};
    }
}
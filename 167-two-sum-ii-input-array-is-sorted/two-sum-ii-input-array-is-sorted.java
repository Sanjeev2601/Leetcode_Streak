class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // int len = numbers.length;
        // int start = 0, end = len -1;
        // while(start<end){
        //     if(numbers[start]+numbers[end]==target)
        //        return new int[]{start+1,end+1};
        //     else if(numbers[start]+numbers[end]<target)
        //        start++;
        //     else
        //        end--;
        // }
        // return new int[]{};
        HashMap<Integer, Integer> visited = new HashMap<>();
        int len = numbers.length;
        for (int i = 0; i < len; i++) {
            visited.put(numbers[i],i);
        }
        for (int i = 0; i < len; ++i) {
            int a = numbers[i];
            int complement = target - a;
            if (visited.containsKey(complement)==true && visited.get(complement)!=i) {
                return new int[]{i+1, visited.get(complement)+1};
            }
        }
        return new int[]{};
    }
}
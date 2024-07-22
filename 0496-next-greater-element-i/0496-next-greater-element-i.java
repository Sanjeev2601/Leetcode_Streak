class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums2.length; i++){
            while(!stack.empty() && nums2[i] > stack.peek()){
                hm.put(stack.pop(), nums2[i]);
            }
            stack.push(nums2[i]);
        }
        while(!stack.empty()){
            hm.put(stack.pop(), -1);
        }
        int[] res = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            res[i] = hm.get(nums1[i]);
        }
        return res;
    }
}
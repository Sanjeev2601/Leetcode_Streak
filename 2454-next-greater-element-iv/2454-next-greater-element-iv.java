class Solution {
    public int[] secondGreaterElement(int[] nums) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            while(!s2.isEmpty() && nums[i] > nums[s2.peek()]){
                int index = s2.pop();
                ans[index] = nums[i];
            }
            Stack<Integer> s = new Stack<>();
            while(!s1.isEmpty() && nums[i] > nums[s1.peek()]){
                s.push(s1.pop());
            }
            while(!s.isEmpty()){
                s2.push(s.pop());
            }
            s1.push(i);
        }
        while(!s1.isEmpty()){
            ans[s1.pop()] = -1;
        }
        while(!s2.isEmpty()){
            ans[s2.pop()] = -1;
        }
        return ans;
    }
}
class Solution {
    public int pivotInteger(int n) {
        // Stack<Integer> left = new Stack<Integer>();
        // Stack<Integer> right = new Stack<Integer>();
        // Map<Integer, Integer> hm = new HashMap<>();
        // int leftsum = 0, rightsum = 0;
        // if(n == 1){
        //     return 1;
        // }
        // for(int i = 1, j = n; i < n; i++, j--){
        //     leftsum += i;
        //     rightsum += j;
        //     left.push(leftsum);
        //     right.push(rightsum);
        //     hm.put(leftsum, i);
        // }
        // int i = 1;
        // int ans = -1;
        // while(i < n){
        //     if(left.peek() < right.peek()){
        //         right.pop();
        //     }
        //     else if(left.peek() > right.peek()){
        //         left.pop();
        //     }
        //     else{
        //         hm.get(left.peek());
        //     }
        // }
        // return ans;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
            hm.put(sum, i);
        }
        int i = n;
        sum = 0;
        while(i > 0){
            sum += i;
            if(hm.containsKey(sum) && hm.get(sum) == i){
                return i;
            }
            i--;
        }
        return -1;
    }
}
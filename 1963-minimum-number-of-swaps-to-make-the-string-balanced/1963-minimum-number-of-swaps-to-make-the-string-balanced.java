class Solution {
    public int minSwaps(String s) {
        // Stack<Character> stack = new Stack<>();
        // for(char ch : s.toCharArray()){
        //     if(ch == '['){
        //         stack.push(ch);
        //     }
        //     else{
        //         if(!stack.isEmpty() && stack.peek() == '['){
        //             stack.pop();
        //         }
        //         else{
        //             stack.push(ch);
        //         }
        //     }
        // }
        // int count = 0;
        // while(!stack.isEmpty()){
        //     stack.pop();
        //     count++;
        // }
        // return ((count/2) + 1)/2; 
        int n = s.length();
        int balance = 0, swaps = 0, j = n - 1;
        char[] arr = s.toCharArray();
        for (int i = 0; i < n; i++) {
            if (arr[i] == '[') {
                balance++;
            } else {
                balance--;
            }
            if (balance < 0) {
                while (i < j && arr[j] != '['){
                    j--;
                }
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                swaps++;
                balance = 1; 
                j--; 
            }
        }
        
        return swaps;
    }
}
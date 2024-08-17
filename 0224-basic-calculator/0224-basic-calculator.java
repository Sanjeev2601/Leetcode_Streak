class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        int tens = 0;
        int sign = 1;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                tens = 10 * tens + (int) (ch - '0');
            }
            else if (ch == '+'){
                ans += sign * tens;
                sign = 1;
                tens = 0;
            }
            else if (ch == '-'){
                ans += sign * tens;
                sign = -1;
                tens = 0;
            }
            else if (ch == '('){
                stack.push(ans);
                stack.push(sign);
                sign = 1;
                ans = 0;
            }
            else if (ch == ')'){
                ans += sign * tens;
                ans *= stack.pop();
                ans += stack.pop();
                tens = 0;
            }
        }     
        return ans + (sign * tens);   
    }
}
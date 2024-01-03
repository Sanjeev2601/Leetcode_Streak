class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        if(n%2 != 0){
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(stack.isEmpty() || ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }
            else{
                if((stack.peek() == '(' && ch == ')') ||
                (stack.peek() == '[' && ch == ']') ||
                (stack.peek() == '{' && ch == '}')){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
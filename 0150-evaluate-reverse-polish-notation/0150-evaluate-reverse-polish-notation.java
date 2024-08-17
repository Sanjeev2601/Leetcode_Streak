class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        for(String str : tokens){
            if(str.equals("+")){
                int temp = stack.pop();
                stack.push(stack.pop() + temp);
            }
            else if(str.equals("-")){
                int temp = stack.pop();
                stack.push(stack.pop() - temp);
            }
            else if(str.equals("*")){
                int temp = stack.pop();
                stack.push(stack.pop() * temp);
            }
            else if(str.equals("/")){
                int temp = stack.pop();
                stack.push(stack.pop() / temp);
            }
            else{
                stack.push(Integer.parseInt(str));
            }
        }
        return stack.pop();
    }
}
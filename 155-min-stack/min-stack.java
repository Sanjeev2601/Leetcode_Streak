class MinStack {
    Stack<Integer> st1 = new Stack <>(); 
    Stack<Integer> st2 = new Stack <>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(st1.size() == 0){
            st1.push(val);
            st2.push(val);
            return;
        }   
        st1.push(val);
        int temp = Math.min(val, st2.peek());
        st2.push(temp);
    }
    
    public void pop() {
        st1.pop();
        st2.pop();
    }
    
    public int top() {
        return st1.peek();
    }
    
    public int getMin() {
        return st2.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
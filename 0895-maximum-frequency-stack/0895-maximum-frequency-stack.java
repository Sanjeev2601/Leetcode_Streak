class FreqStack {
    
    HashMap<Integer ,Stack<Integer>> st;
    HashMap<Integer,Integer> fmap;
    int maxfreq;
    public FreqStack() {
        st = new HashMap<>();
        fmap = new HashMap<>();
        maxfreq = 0;
    }
    
    public void push(int val) {
        int f = fmap.getOrDefault(val,0);
        f++;
        fmap.put(val,f);
        if(st.containsKey(f)==false){
            st.put(f,new Stack<>());
            maxfreq = Math.max(maxfreq,f);
        }
         st.get(f).push(val);
        
    }
    
    public int pop() {
        int ans = st.get(maxfreq).pop();
        int f = fmap.get(ans);
        f--;
        fmap.put(ans,f);
        if(st.get(maxfreq).size()==0){
            st.remove(maxfreq);
            maxfreq--;
        }
        return ans;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */
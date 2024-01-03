class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i = 0; i < n; i++){
            if(st.size() == 0){
                st.push(s.charAt(i));
                continue;
            }
            if(st.peek() == s.charAt(i)){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        char[] arr = new char[st.size()];
        for(int i = arr.length-1; i >= 0; i--){
            arr[i] = st.pop();
        }
        return String.valueOf(arr);
    }
}
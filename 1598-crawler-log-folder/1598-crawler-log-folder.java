class Solution {
    public int minOperations(String[] logs) {
        int a = 0;
        for(String s : logs){
            if(s.equals("../")){
                a = Math.max(0, a - 1);
            }
            else if (!s.equals("./")){
                a++;
            }
        }
        return a;
    }
}
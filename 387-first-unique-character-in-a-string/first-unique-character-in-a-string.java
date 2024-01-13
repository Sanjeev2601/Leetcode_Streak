class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int i = 0;
        while(i < s.length()){
            char ch = s.charAt(i);
            if(hm.containsKey(ch)){
                int temp = hm.get(ch);
                hm.put(ch, temp + 1);
            }
            else{
                hm.put(ch, 1);
            }
            i++;
        }
        i = 0;
        int ans = 0;
        while(i < s.length()){ 
            char ch = s.charAt(i);
            if(hm.get(ch) == 1){
                return i;
            }
            i++;   
        }  
        return -1;
    }
}

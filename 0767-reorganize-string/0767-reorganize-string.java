class Solution {
    public String reorganizeString(String s) {
        int[] ch = new int[26];
        for(char c : s.toCharArray()){
            ch[c - 'a']++;
        }
        var pq = new PriorityQueue<int[]>((a, b) -> Integer.compare(b[1], a[1]));
        for(int i = 0; i < 26; i++){
            if(ch[i] > 0){
                pq.add(new int[] {i + 'a', ch[i]});
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            int[] first = pq.remove();
            if (sb.length() == 0 || first[0] != sb.charAt(sb.length() - 1)) {
                sb.append((char) first[0]);
                if (--first[1] > 0) {
                    pq.add(first);
                }
            } else {
                if (pq.isEmpty()) {
                    return "";
                }
                
                int[] second = pq.remove();
                sb.append((char) second[0]);
                if (--second[1] > 0) {
                    pq.offer(second);
                }   
                pq.offer(first);
            }
        }
        return sb.toString();
    }
}
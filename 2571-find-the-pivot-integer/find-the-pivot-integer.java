class Solution {
    public int pivotInteger(int n) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
            hm.put(sum, i);
        }
        int i = n;
        sum = 0;
        while(i > 0){
            sum += i;
            if(hm.containsKey(sum) && hm.get(sum) == i){
                return i;
            }
            i--;
        }
        return -1;
    }
}
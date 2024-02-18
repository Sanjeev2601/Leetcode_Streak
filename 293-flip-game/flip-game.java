class Solution {
    public List<String> generatePossibleNextMoves(String currentState) {
        List<String> ans = new ArrayList<>();
        int n = currentState.length();
        for(int i = 0; i < n - 1; i++){
            if(currentState.charAt(i) == '+' && currentState.charAt(i + 1) == '+') {
                String temp = currentState.substring(0, i) + "--" + currentState.substring(i + 2);
                ans.add(temp);
            }
        }
        return ans;
    }
}
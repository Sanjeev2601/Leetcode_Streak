class Solution {
    public String longestDiverseString(int a, int b, int c) {
        int n = a + b + c;
        int index = 0;
        StringBuilder sb = new StringBuilder();
        int streakA = 0, streakB = 0, streakC = 0;
        while(index < n){
            if(a >= b && a >= c && streakA < 2 || (a > 0 && (streakB == 2 || streakC == 2))){
                sb.append('a');
                streakB = 0;
                streakC = 0;
                streakA++;
                a--;
            }
            else if(b >= a && b >= c && streakB < 2 || (b > 0 && (streakA == 2 || streakC == 2))){
                sb.append('b');
                streakA = 0;
                streakC = 0;
                streakB++;
                b--;
            }
            else if(c >= a && c >= b && streakC < 2 || (c > 0 && (streakB == 2 || streakA == 2))){
                sb.append('c');
                streakB = 0;
                streakA = 0;
                streakC++;
                c--;
            }
            index++;
        }
        return sb.toString();
    }
}
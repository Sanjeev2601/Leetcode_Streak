class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        for(int i = 0; i < arr.length - 2; i++){
            int check = arr[i] * arr[i + 1] * arr[i + 2];
            if(check % 2 != 0){
                return true;
            }
        }
        return false;
    }
}
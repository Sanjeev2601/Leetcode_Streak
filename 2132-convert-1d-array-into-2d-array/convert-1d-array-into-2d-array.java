class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
      if (original.length != m * n){
        return new int[][] {};
      }
      int[][] twoArray = new int [m][n];
      int j = 0, k = 1;
      twoArray[0][0] = original[0];
      if(n-1 > 0){
        for(int i =1; i < m*n ; i++) {
          if(k != n-1){
            twoArray[j][k] = original[i];
            k++;
          }
          else{
            twoArray[j][k] = original[i];
            j++;
            k = 0;
          }
        }
      }
      else{
        for(j =1; j<m;j++){
          twoArray[j][0] = original[j];
        }
      }
      return twoArray;
    }
}
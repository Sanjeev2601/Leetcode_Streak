class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = code[i];
        }
        if(k == 0){
            for(int i = 0; i < n; i++){
                arr[i] = 0;
            }
        }
        else if(k < 0){
            int temp = k;
            int sum = 0;
            for(int i = 0; i < n; i++){
                temp = k*-1;
                sum = 0;
                int j = i-1;
                while(temp > 0){
                    if(j < 0)
                        j = n-1;
                    sum += code[j];
                    j--;  
                    temp--;
                }
                arr[i] = sum;
            }
        }
        else{
            int temp = k;
            int sum = 0;
            for(int i = 0; i < n; i++){
                temp = k;
                sum = 0;
                int j = i+1;
                while(temp > 0){
                    if(j > n-1)
                        j = 0;
                    sum += code[j];
                    j++;
                    temp--;  
                }
                arr[i] = sum;
            }
        }
        return arr;
    }
}
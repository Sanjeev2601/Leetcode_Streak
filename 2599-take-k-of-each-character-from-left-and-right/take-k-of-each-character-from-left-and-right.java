class Solution {
    public boolean valid(int arr[],int k){
         if(arr[0]<k || arr[1]<k || arr[2]<k){
             return false;
         }
         return true;
    }
    public int takeCharacters(String s, int k) {
        int n = s.length();
        if(n < 3*k){
            return -1;
        }
        int arr[] = new int[3];
        for(int i = 0; i < n; i++){
            arr[s.charAt(i)-'a']++;
        }
        if(!valid(arr, k)){
            return -1;
        }
        int i = s.length()-1;
        int j = s.length()-1;
        int sum = arr[0] + arr[1] + arr[2];
        int mini = n;
        while(i>=0 && j>=0){
            arr[s.charAt(i)-'a']--;
            i--;
            while(!valid(arr,k) && j>=0){
                arr[s.charAt(j)-'a']++;
                j--;    
            }
            sum = arr[0] + arr[1] + arr[2];
            mini = Math.min(sum,mini);
        }
        return mini;
    }
}
class Solution {
    public String largestNumber(int[] nums) {
        String s[]=new String[nums.length];
        int check = 0;
        for(int i=0;i<nums.length;i++){
            s[i]=String.valueOf(nums[i]);
            if(nums[i] > 0){
                check++;
            }
        }
        StringBuilder sb=new StringBuilder("");
        Arrays.sort(s,(a,b)->(b+a).compareTo(a+b));
        for(String str:s)
        {
            sb.append(str);
        }
        String result=sb.toString();
        if(check == 0){
            String zero = Integer.toString(0);
            return zero;
        }
        return result;
    }
}
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {    
        int maxy = 0;
        for(int i : candies){
            maxy = Math.max(maxy,i);
        }      
        List<Boolean> ans = new ArrayList<>();
        for(int kid : candies){
            ans.add((kid + extraCandies)>=maxy);
        }
        return ans;
    }
}
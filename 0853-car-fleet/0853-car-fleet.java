class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        if (position.length == 1){
            return 1;
        }
        Stack<Double> stack = new Stack<>();
        int[][] vel = new int[position.length][2];
        for(int i = 0; i < position.length; i++){
            vel[i][0] = position[i];
            vel[i][1] = speed[i];
        }
        Arrays.sort(vel, (a, b) -> Integer.compare(a[0], b[0]));
        for(int i = vel.length - 1; i >= 0; i--){
            double check = (double) (target - vel[i][0]) / vel[i][1];
            if(!stack.isEmpty() && check <= stack.peek()){
                continue;
            }
            else{
                stack.add(check);
            }
        }
        return stack.size();
    }
}
class Solution {
    private boolean bfs(int[][] graph, int[] color, int start){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        color[start] = 1;
        while(!q.isEmpty()){
            int temp = q.remove();
            for(int i : graph[temp]){
                if(color[i] == 0){
                    color[i] = -color[temp];
                    q.add(i);
                }
                else if(color[i] == color[temp]){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int[] color = new int[graph.length];
        for(int i = 0; i < graph.length; i++){
            if(color[i] == 0){
                if(!bfs(graph, color, i)){
                    return false;
                }
            }
        }
        return true;
    }
}
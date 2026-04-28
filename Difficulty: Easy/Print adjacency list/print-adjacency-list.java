
class Solution {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        // code here
        List<List<Integer>> graph = new ArrayList<>();
        
        for(int i=0; i<V; i++) {
            graph.add(new ArrayList<>());
        }
        
        
        for(int i=0; i<edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        
        return graph;
    }
}
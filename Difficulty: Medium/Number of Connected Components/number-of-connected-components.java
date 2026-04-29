class Solution {
    int countConnected(int n, ArrayList<ArrayList<Integer>> edges) {
        // code here
        int m = edges.size();
        ArrayList<ArrayList<Integer>> graph = construction(n,  m, edges);

        int ans = 0;
        boolean[] vis = new boolean[n];
        for(int i=0; i<n; i++) {
            if (vis[i] == false) {
                vis[i] = true;
                dfs(graph, vis, i);
                ans++;
            }
        }

        return ans;
    }
    
   

    public void dfs(ArrayList<ArrayList<Integer>> graph, boolean[] vis, int src) {
        ArrayList<Integer> nbrs = graph.get(src);

        for(int v : nbrs) {
            if(vis[v] == false) {
                vis[v] = true;
                dfs(graph, vis, v);
            }
        }
    }
    
    public ArrayList<ArrayList<Integer>> construction(int n, int m, ArrayList<ArrayList<Integer>> edges) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0; i<n; i++) {
            graph.add(new ArrayList<>());
        }

       for (ArrayList<Integer> edge : edges) {
            int u = edge.get(0);
            int v = edge.get(1);
            // Since it's an undirected graph, add both directions
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        return graph;
    }
}
class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
         ArrayList<Integer> result = new ArrayList<>();

    int N = adj.size();
    boolean[] vis = new boolean[N];
    Queue<Integer> q = new LinkedList<>();


    q.add(0);
    vis[0] = true;

    while (!q.isEmpty()) {
        int node = q.poll();
        result.add(node);
        
        for (int neighbor : adj.get(node)) {
            if (!vis[neighbor]) {
                q.add(neighbor);
                vis[neighbor] = true;
            }
        }
    }

    return result;
    }
}
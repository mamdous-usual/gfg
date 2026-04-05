class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        if(q.isEmpty()) return  q;
         Stack<Integer> st = new Stack<>();
        int n = q.size();
        
        if(k > n) return q; 

        for(int i=1; i<=k; i++) {
            st.push(q.remove());
        }

        for(int i=1; i<=k; i++) {
            int temp = st.pop();
            q.add(temp);
        }

        for(int i=1; i<=n-k; i++) {
            int temp = q.remove();
            q.add(temp);
        }

        return q;
    }
}
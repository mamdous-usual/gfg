class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        // Your code here
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // min heap
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=0; i<k; i++) {
            pq.add(arr[i]);
        }

        for(int i=k; i<arr.length; i++) {
            if(arr[i] > pq.peek()) {
                pq.remove();
                pq.add(arr[i]);
            }
        }
        
        while(pq.size() > 0) {
            ans.add(pq.remove());
        }
        
        Collections.reverse(ans);
       return ans;
    }
}

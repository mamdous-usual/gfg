class Solution {
    // Function to return kth largest element from an array.
    public static int KthLargest(int arr[], int k) {
        // Your code here
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // min heap

        for(int i=0; i<k; i++) {
            pq.add(arr[i]);
        }

        for(int i=k; i<arr.length; i++) {
            if(arr[i] > pq.peek()) {
                pq.remove();
                pq.add(arr[i]);
            }
        }

        return pq.peek();
    }
}
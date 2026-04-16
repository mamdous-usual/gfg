class Solution {
    public static int kthSmallest(int arr[], int k) {
        //  code here
        PriorityQueue<Integer> mh = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0; i<k; i++) {
            mh.add(arr[i]);
        }
        
        for (int i=k; i<arr.length; i++) {
            if(arr[i] < mh.peek()) {
                mh.remove();
                mh.add(arr[i]);
            }
        }
        
        return mh.peek();
    }
}

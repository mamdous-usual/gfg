class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] <= x) ans = i;
        }
        
        return ((ans >= 0) ? ans :  -1);
    }
}

class Solution {
    int maxProduct(int[] arr) {
        // code here
        int maxProduct = arr[0];
        int maxSoFar = arr[0];
        int minSoFar = arr[0];
        
        for(int i=1; i<arr.length; i++) {
            int current = arr[i];
            
            int tempMax = Math.max(current, Math.max(current * maxSoFar, current * minSoFar));
            int tempMin = Math.min(current, Math.min(current * maxSoFar, current * minSoFar));
            
            maxSoFar = tempMax;
            minSoFar = tempMin;
            
            maxProduct = Math.max(maxProduct, maxSoFar);
        }
        
        return maxProduct;
    }
}
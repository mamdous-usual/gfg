
class Solution {

    public long minMaxProduct(int[] arr1, int[] arr2) {
        // code here
        long min = Integer.MAX_VALUE;
        long max = Integer.MIN_VALUE;
        
        for(int num : arr1) {
            if(num > max) max = num;
        }
        
        for(int num : arr2) {
            if(num < min) min = num;
        }
        
        return max * min;
    }
}
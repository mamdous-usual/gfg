class Solution {
    public int maxWater(int arr[]) {
        // Code Here
        int maxWater = 0;
        int left = 0;
        int right = arr.length - 1;
        
        while(left < right) {
            int currentWater = (right - left) * Math.min(arr[left], arr[right]);
            
            maxWater = Math.max(maxWater, currentWater);
            
            if(arr[left] <= arr[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return maxWater;
    }
}
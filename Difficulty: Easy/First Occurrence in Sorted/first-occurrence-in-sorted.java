class Solution {
    public int firstSearch(int[] arr, int k) {
        // Code Here
        int left = 0;
        int right = arr.length - 1;
        int res = -1;
        
        while(left <= right) {
            int mid = left + (right - left) / 2;
            
            if(arr[mid] == k) {
               res = mid;
               right = mid - 1;
            }
            else if (arr[mid] < k) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        
        return  res;
    }
}
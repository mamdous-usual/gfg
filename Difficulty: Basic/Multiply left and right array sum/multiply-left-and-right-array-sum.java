// User function Template for Java

class Solution {
    public int multiply(int[] arr) {
        int mid = arr.length/2;
        int rightSum = 0;
        int leftSum = 0;
        for(int i=0; i<mid; i++){
            rightSum += arr[i];
        }
        
        for(int j=mid; j<arr.length; j++) {
            leftSum += arr[j];
        }
        
        return rightSum * leftSum;
    }
}

// User function Template for Java

class Solution {
    int[] getMoreAndLess(int[] arr, int target) {
        int lessOrEqual = 0;
        int greaterOrEqual = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] < target) lessOrEqual++;
            else if (arr[i] > target) greaterOrEqual++;
            else if(arr[i] == target){
                lessOrEqual++;
                greaterOrEqual++;
            }
        }
        
        return new int[] {lessOrEqual, greaterOrEqual};
        
    }
}
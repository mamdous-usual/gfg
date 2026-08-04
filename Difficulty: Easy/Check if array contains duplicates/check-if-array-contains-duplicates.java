class Solution {
    public boolean checkDuplicates(int arr[]) {
        // Code here
        
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] == arr[j]) return true;
            }
        }
        
        return false;
    }
}
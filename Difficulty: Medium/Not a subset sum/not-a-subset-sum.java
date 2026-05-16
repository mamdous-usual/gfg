class Solution {
    public int findSmallest(int[] arr) {
        // code here
        Arrays.sort(arr);
        int  min=1;
       
       for (int i = 0; i < arr.length; i++) {
           if(arr[i]>min){
               return(int) min;
           }
           min+=arr[i];
       }
       return min;
    }
}
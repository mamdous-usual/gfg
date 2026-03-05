
class Solution {

    public static int product(int arr[], int n) {
        int res = 1;
        for(int i=0; i<n; i++) {
            res *= arr[i];
        }
        return res;
    }
}

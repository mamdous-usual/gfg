class Solution {
    public int gcd(int n, int arr[]) {
        int ans = Math.abs(arr[0]);
        
        for(int i=1; i<n; i++) {
            ans = helper(ans, Math.abs(arr[i]));
        }
        
        return ans;
    }
    
    static int helper(int a, int b) {
        if(a == 0) return b;
        
        int temp = helper(b%a, a);
        
        return temp;
    }
}
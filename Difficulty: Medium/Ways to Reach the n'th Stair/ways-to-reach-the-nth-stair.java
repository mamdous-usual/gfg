class Solution {
    int countWays(int n) {
        // your code here
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        
        return countHelper(n, dp);
    }
    
    int countHelper(int n, int[] dp) {
        if(n == 1 || n == 2) return n;
        if(dp[n] != -1) return dp[n];
        
        int a = countHelper(n-1, dp);
        int b = countHelper(n-2, dp);
        
        dp[n] = a + b;
        
        return a + b;
    }
}

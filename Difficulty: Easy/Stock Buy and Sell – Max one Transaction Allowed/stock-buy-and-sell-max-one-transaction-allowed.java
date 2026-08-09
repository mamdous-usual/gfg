class Solution {
    public int maxProfit(int[] prices) {
        // Code here
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        
        for(int i=0; i<prices.length; i++) {
            int currentPrice = prices[i];
            if(currentPrice < minPrice) {
                minPrice = currentPrice;
            } else {
                int currentProfit = currentPrice - minPrice;
                maxProfit = Math.max(maxProfit, currentProfit);
            }
        }
        
        return maxProfit;
    }
}
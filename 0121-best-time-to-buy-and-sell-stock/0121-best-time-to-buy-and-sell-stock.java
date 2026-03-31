class Solution {
    public int maxProfit(int[] prices) {

        //Kadane’s Algorithm

        int maxProfit = 0, currentProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            currentProfit = Math.max(0, currentProfit + prices[i] - prices[i-1]);
            maxProfit = Math.max(maxProfit, currentProfit);
        }

        return maxProfit;
    }
}
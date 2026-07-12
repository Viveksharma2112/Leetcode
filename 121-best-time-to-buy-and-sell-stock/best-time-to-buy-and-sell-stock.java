class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min_price = prices[0];
        int max_profit = 0;
        for(int i = 0 ; i<n ;i++){
            if(min_price > prices[i]){
                min_price = prices[i];
            }
            else if(prices[i]-min_price > max_profit){
                max_profit = prices[i]-min_price;
            }
        }

        return max_profit;
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0 ;
        int maxprof = 0 ;
        int i = 0 ;
        
            for(int j =0; j< prices.length ; j++){
                
                profit = prices[j]-prices[i];
                maxprof = Math.max(maxprof,profit);
                while(prices[j]<prices[i]){
                    i++;
                }
               
                
            
        }
        return maxprof;
        
    }
}
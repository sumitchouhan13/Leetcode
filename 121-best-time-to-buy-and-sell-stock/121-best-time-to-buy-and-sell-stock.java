class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0 , min = Integer.MAX_VALUE , n = prices.length;
        for(int i = 0 ; i < n ; i++){
            if(prices[i] < min){
                min = prices[i];
            }else if(prices[i] - min > profit){
                profit = prices[i] - min;
            }
        }
        return profit;
    }
}
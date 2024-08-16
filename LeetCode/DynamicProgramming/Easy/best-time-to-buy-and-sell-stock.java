class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;

        int buy = prices[0];
        int sell = prices[0];

        for(int x:prices){
            if(x<buy){
                buy = x;
            }
            if(x>=buy){
                sell = x;
            }

            if(sell-buy>max_profit){
                max_profit = sell-buy;
            }
        }

        return max_profit;
    }
}

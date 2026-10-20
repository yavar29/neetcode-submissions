class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int max_profit=0;

        for(int i=1;i<prices.length;i++){
            if(prices[i]-min>0) max_profit=Math.max(max_profit, prices[i]-min);
            if(prices[i]<min) min=prices[i];
        }
        return max_profit;
    }
}

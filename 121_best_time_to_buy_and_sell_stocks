class Solution {
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i = 0; i<prices.length;i++){
            if(prices[i]<minprice){
                minprice = prices[i];
            }
            maxprofit=Math.max(prices[i] - minprice, maxprofit);

        }
        return maxprofit;
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int j = i + 1;
        int res = 0;

        while (i < prices.length && j < prices.length) {
            if(prices[i] >= prices[j]) {
                i = j;
                j++;
            } else if(prices[i] < prices[j]) {
                res = Math.max(res, prices[j] - prices[i]);
                j++;
            }
        }
        return res;
        
    }
}

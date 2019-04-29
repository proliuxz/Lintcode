public class S149 {
    public int maxProfit(int[] prices) {
        // write your code here
        if(prices.length<2)
            return 0;
        int min = prices[0];
        int profit = 0;
        for(int p : prices)
        {
            profit = Math.max(profit, p - min);
            min = Math.min(min, p);
        }
        return profit;
    }
}

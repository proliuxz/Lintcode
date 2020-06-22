package S601TO800;

public class S798 {
    /*
    798. 背包问题VII
    假设你身上有 n 元，超市里有多种大米可以选择，每种大米都是袋装的，必须整袋购买，给出每种大米的重量，价格以及数量，求最多能买多少公斤的大米

    样例
    样例 1:

    输入:  n = 8, prices = [3,2], weights = [300,160], amounts = [1,6]
    输出:  640
    解释:  全买价格为2的米。
    样例 2:

    输入:  n = 8, prices  = [2,4], weight = [100,100], amounts = [4,2 ]
    输出:  400
    解释:  全买价格为2的米
     */
    public int backPackVII(int n, int[] prices, int[] weight, int[] amounts) {
        int[] dp = new int[n + 1];
        int len = prices.length;
        for (int i = 0; i < len; i++) {
            for (int j = 1; j <= amounts[i]; j++) {
                for (int k = n; k >= prices[i] ; k--) {
                    dp[k] = Math.max(dp[k - 1], dp[k - prices[i]] + weight[i]);
                }
            }
        }
        return dp[n];
    }
}
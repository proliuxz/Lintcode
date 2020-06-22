package S801TO1000;

public class S801 {
    public int backPackX(int n) {
        int[] prices = {150, 250, 350};
        int[] dp = new int[n + 1];
        for (int i = 0; i < 3; i++)
            for (int j = prices[i]; j <= n; j++)
                dp[j] = Math.max(dp[j], dp[j - prices[i]] + prices[i]);
        return n - dp[n];
    }
}

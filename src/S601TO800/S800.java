package S601TO800;

public class S800 {
    public double backpackIX(int n, int[] prices, double[] probability) {
        if (probability == null || probability.length == 0)
            return 0;

        double[] dp = new double[n + 1];
        for (int i = 0; i <= n; i++)
            dp[i] = 1;

        for (int i = 1; i <= probability.length; i++)
            for (int j = n; j >= prices[i - 1]; j--)
                dp[j] = Math.min(dp[j], (1 - probability[i - 1]) * dp[j - prices[i - 1]]);

        return 1 - dp[n];
    }
}

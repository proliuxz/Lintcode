package S1801TO2000;

public class S1825 {
    public int numberChange(int k) {
        int[] dp = new int[k + 1];
        dp[0] = 0;
        for (int i = 1; i <= k; i++)
            dp[i] = ((i % 2 == 0 && dp[i / 2] < dp[i - 1]) ? dp[i / 2] : dp[i - 1]) + 1;
        return dp[k];
    }
}

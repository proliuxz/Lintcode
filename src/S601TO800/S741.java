package S601TO800;

public class S741 {
    public int maxValue(String str) {
        int n = str.length();
        int dp[][] = new int[n][n];
        for (int i = 0; i < n; ++i) {
            dp[i][i] = str.charAt(i) - '0';
        }

        for (int l = 2; l <= n; ++l) {
            for (int i = 0; i < n - l + 1; ++i) {
                int j = i + l - 1;
                for (int k = i; k < j; ++k) {
                    dp[i][j] = Math.max(dp[i][j], Math.max(dp[i][k] + dp[k + 1][j], dp[i][k] * dp[k + 1][j]));
                }
            }
        }

        return dp[0][n - 1];
    }
}

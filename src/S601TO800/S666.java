package S601TO800;

public class S666 {
    public int getMoneyAmount(int n) {
        int[][] dp = new int[n + 1][n + 1];
        for (int len = 2; len <= n; len++) {
            for (int l = 1; l <= n - len + 1; l++) {
                int r = l + len - 1;
                if (len == 2) {
                    dp[l][r] = l;
                    continue;
                }
                int min = Integer.MAX_VALUE;
                for (int mid = l + 1; mid < r; mid++) {
                    int val = mid + Math.max(dp[l][mid - 1], dp[mid + 1][r]);
                    min = Math.min(min, val);
                }
                dp[l][r] = min;
            }
        }
        return dp[1][n];
    }
}
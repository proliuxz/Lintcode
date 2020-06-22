package S401TO600;

import java.util.stream.IntStream;

public class S593 {
    public int stoneGame2(int[] A) {
        if (A == null || A.length == 0)
            return 0;

        int n = A.length;
        int[] sum = new int[2 * n + 1];
        int[][] dp = new int[2 * n][2 * n];

        IntStream.rangeClosed(1, 2 * n).forEach(i -> sum[i] = sum[i - 1] + A[(i - 1) % n]);

        for (int len = 2; len <= 2 * n; len++) {
            for (int i = 0; i + len - 1 < 2 * n; i++) {
                int j = i + len - 1;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++)
                    dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k + 1][j] + sum[j + 1] - sum[i]);
            }
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++)
            min = Math.min(min, dp[i][i + n - 1]);
        return min;
    }
}

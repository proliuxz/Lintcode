package S201TO400;

public class S392 {
    public long houseRobber(int[] A) {
        // write your code here
        int len = A.length;
        long[][] dp = new long[len + 1][2];
        for (int i = 0; i < len; i++) {
            dp[i + 1][0] = dp[i][1] + A[i];
            dp[i + 1][1] = Math.max(dp[i][0], dp[i][1]);
        }
        return Math.max(dp[len][0], dp[len][1]);
    }
}

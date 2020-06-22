package S1001TO1200;

public class S1054 {
    public int minCostClimbingStairs(int[] cost) {
        if (cost == null || cost.length == 0)
            return 0;
        int len = cost.length;
        int[] dp = new int[len];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < len; i++)
            dp[i] = Math.min(dp[i-1], dp[i-2]) + cost[i];
        return Math.min(dp[len - 1], dp[len - 2]);
    }
}

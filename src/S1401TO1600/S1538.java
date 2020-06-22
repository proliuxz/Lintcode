package S1401TO1600;

public class S1538 {
    public boolean cardGame(int[] cost, int[] damage, int totalMoney, int totalDamage) {
        int[] dp = new int[totalMoney + 1];
        int n = cost.length;
        for (int i = 0; i < n; i++)
            for (int j = totalMoney; j >= cost[i]; j--)
                if (dp[j] < dp[j - cost[i]] + damage[i])
                    dp[j] = dp[j - cost[i]] + damage[i];
        return dp[totalMoney] >= totalDamage ? true : false;
    }
}

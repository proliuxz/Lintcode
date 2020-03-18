package S601TO800;

import java.util.Arrays;
import java.util.stream.IntStream;

public class S669 {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        IntStream.rangeClosed(1, amount).forEach(i -> {
            dp[i] = Integer.MAX_VALUE;
            Arrays.stream(coins)
                    .filter(coin -> i - coin >= 0 && dp[i - coin] != Integer.MAX_VALUE)
                    .forEach(coin -> dp[i] = Math.min(dp[i], 1 + dp[i - coin]));
        });
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }
}

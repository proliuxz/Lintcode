package S601TO800;

import java.util.Arrays;

public class S740 {
    int result = 0;
    public int change(int amount, int[] coins) {
        // write your code here
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int i: coins) {
            for (int j = i; j < amount + 1; j++) {
                dp[j] = dp[j] + dp[j - i];
            }
        }
        return dp[amount];
    }

    public static void main(String[] args)
    {
        S740 s = new S740();
        int amount = 8;
        int[] coins = new int[] {2, 3, 8};
        int res = s.change(amount, coins);
        System.out.println(res);
    }
}

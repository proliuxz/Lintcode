package S601TO800;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class S707 {
    public int balanceGraph(int[][] edges) {
        Map<Integer, Integer> debt = new HashMap<>();
        for (int[] t : edges) {
            debt.put(t[0], debt.getOrDefault(t[0], 0) - t[2]);
            debt.put(t[1], debt.getOrDefault(t[1], 0) + t[2]);
        }

        int[] account = new int[debt.size()];
        int len = 0;

        for (int v : debt.values())
            if (v != 0)
                account[len++] = v;

        if (len == 0)
            return 0;

        int[] dp = new int[1 << len];
        Arrays.fill(dp, Integer.MAX_VALUE / 2);
        for (int i = 1; i < dp.length; i++) {
            int sum = 0;
            int count = 0;
            for (int j = 0; j < len; j++) {
                if ((1 << j & i) != 0) {
                    sum += account[j];
                    count++;
                }
            }

            if (sum == 0) {
                dp[i] = count - 1;
                for (int j = 1; j < i; j++) {
                    if (((i & j) == j) && dp[j] + dp[i - j] < dp[i])
                        dp[i] = dp[j] + dp[i - j];
                }
            }
        }
        return dp[dp.length - 1];
    }
}

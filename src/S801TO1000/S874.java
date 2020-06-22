package S801TO1000;

import java.util.Arrays;

public class S874 {
    public int maxVacationDays(int[][] flights, int[][] days) {
        int n = flights.length;
        int k = days[0].length;
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MIN_VALUE);
        dp[0] = 0;
        for (int j = 0; j < k; ++j) {
            int[] t = new int[n];
            Arrays.fill(t, Integer.MIN_VALUE);
            for (int i = 0; i < n; ++i)
                for (int p = 0; p < n; ++p)
                    if (i == p || flights[p][i] == 1)
                        t[i] = Math.max(t[i], dp[p] + days[i][j]);
            dp = t;
        }
        return Arrays.stream(dp).max().getAsInt();
    }
}

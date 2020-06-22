package S1201TO1400;

public class S1346 {
    public int calculateMinimumHP(int[][] dungeon) {
        if (dungeon == null || dungeon.length == 0)
            return 1;
        int h = dungeon.length;

        if (dungeon[0].length == 0)
            return 1;

        int w = dungeon[0].length;

        int[][] dp = new int[h][w];
        dp[h - 1][w - 1] = Math.max(1 - dungeon[h - 1][w - 1], 1);

        for (int i = h - 2; i >= 0; i--)
            dp[i][w - 1] = Math.max(dp[i + 1][w - 1] - dungeon[i][w - 1], 1);

        for (int i = w - 2; i >= 0; i--)
            dp[h - 1][i] = Math.max(dp[h - 1][i + 1] - dungeon[h - 1][i], 1);

        for (int i = h - 2; i >= 0; i--) {
            for (int j = w - 2; j >= 0; j--) {
                int curr = Math.min(dp[i + 1][j], dp[i][j + 1]);
                dp[i][j] = Math.max(curr - dungeon[i][j], 1);
            }
        }

        return dp[0][0];
    }
}

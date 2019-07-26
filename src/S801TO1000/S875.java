package S801TO1000;

public class S875 {
    public int longestLine(int[][] M) {
        // Write your code here
        int res = 0;
        if (M == null || M.length == 0 || M[0].length == 0)
            return res;
        int h = M.length;
        int w = M[0].length;
        int[][][] dp = new int[h][w][4];
        for (int i = 0; i < h; i++)
            for (int j = 0; j < w; j++)
                if (M[i][j] == 1) {
                    for (int k = 0; k < 4; k++)
                        dp[i][j][k] = 1;
                    if (i - 1 >= 0)
                        dp[i][j][1] += dp[i - 1][j][0];
                    if (j - 1 >= 0)
                        dp[i][j][0] += dp[i][j - 1][1];
                    if (i - 1 >= 0 && j - 1 >= 0)
                        dp[i][j][2] += dp[i - 1][j - 1][2];
                    if (i - 1 >= 0 && j + 1 < w)
                        dp[i][j][3] += dp[i - 1][j + 1][3];
                    int tmp1 = Math.max(dp[i][j][0], dp[i][j][1]);
                    int tmp2 = Math.max(dp[i][j][2], dp[i][j][3]);
                    int tmp3 = Math.max(tmp1, tmp2);
                    if (tmp3 > res)
                        res = tmp3;
                }
        return res;
    }
}

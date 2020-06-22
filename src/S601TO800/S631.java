package S601TO800;

public class S631 {
    public int maxSquare2(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int res = 0;
        int[][][] dp = new int[3][m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                if (matrix[i][j] == 1) {
                    if (i == 0 || j == 0)
                        dp[0][i][j] = 1;
                    else
                        dp[0][i][j] = Math.min(Math.min(dp[0][i - 1][j - 1], dp[2][i - 1][j]), dp[1][i][j - 1]) + 1;
                    res = Math.max(res, dp[0][i][j]);
                    dp[1][i][j] = 0;
                    dp[2][i][j] = 0;
                } else {
                    dp[0][i][j] = 0;
                    dp[1][i][j] = (j == 0) ? 1 : dp[1][i][j - 1] + 1;
                    dp[2][i][j] = (i == 0) ? 1 : dp[2][i - 1][j] + 1;
                }
        }
        return res * res;
    }
}

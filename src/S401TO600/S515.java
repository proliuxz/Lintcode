package S401TO600;

public class S515 {
    public int minCost(int[][] costs) {
        // write your code here
        if (costs == null || costs.length == 0 || costs[0].length == 0)
            return 0;
        int r = costs.length;
        int[][] dp = new int[r][3];
        dp[0] = costs[0];
        for (int j = 1; j < r; j++) {
            for (int i = 0; i < 3; i++) {
                dp[j][i] = costs[j][i] + Math.min(dp[j - 1][(i + 1)%3], dp[j - 1][(i + 2)%3]);
            }
        }
        return Math.min(Math.min(dp[r - 1][0],dp[r - 1][1]), dp[r - 1][2]);
    }

    public static void main(String[] args)
    {
        S515 s = new S515();
        int[][] cost = new int[][] {{14,2,11},{11,14,5},{14,3,10},{14,4,1}};
        int res = s.minCost(cost);
        System.out.println(res);
    }
}

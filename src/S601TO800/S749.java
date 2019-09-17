package S601TO800;

public class S749 {
    public String isBuild(int x) {
        // write you code here
        if (x <= 7)
            return (x == 3 || x == 7) ? "YES" : "NO";
        boolean[] dp = new boolean[x+1];
        dp[3] = true;
        dp[7] = false;
        for (int i = 8; i < x + 1; i++) {
            dp[i] = dp[i-3] || dp[i-7];
        }
        return dp[x] ? "YES" : "NO";
    }
}

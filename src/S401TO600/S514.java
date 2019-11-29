package S401TO600;

public class S514 {
    public int numWays(int n, int k) {
        // write your code here
        int dp[] = {0, k , k*k, 0};
        if(n <= 2)
            return dp[n];
        if (k == 1)
            return 0;
        for(int i = 2; i < n; i++) {
            dp[3] = (k - 1) * (dp[1] + dp[2]);
            dp[1] = dp[2];
            dp[2] = dp[3];
        }
        return dp[3];
    }
}

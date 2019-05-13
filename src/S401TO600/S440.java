package S401TO600;

public class S440 {
    public int backPackIII(int[] A, int[] V, int m) {
        // write your code here
        int[] dp = new int[m+1];
        for (int i = 0; i < A.length; i++) {
            for (int j = 1; j <= m; j++) {
                if (j >= A[i])
                    dp[j] = Math.max(dp[j], dp[j-A[i]] + V[i]);
            }
        }
        return dp[m];
    }
}

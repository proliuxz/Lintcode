package S801TO1000;

public class S982 {
    public int numberOfArithmeticSlices(int[] A) {
        int result = 0;
        if (A == null || A.length == 0)
          return result;
        int len = A.length;
        int[] dp = new int[len];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < len ; i++) {
            if (A[i - 1]<<1 == A[i] + A[i - 2]) {
                dp[i] = dp[i - 1] + 1;
                result += dp[i] - 2;
            }
            else
                dp[i] = 2;
        }
        return result;
    }
}

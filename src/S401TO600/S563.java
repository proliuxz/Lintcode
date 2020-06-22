package S401TO600;

public class S563 {
    public int backPackV(int[] nums, int target) {
        // write your code here
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int num : nums) {
            for (int j = target; j >= 0; j--) {
                if (j >= num)
                    dp[j] += dp[j - num];
            }
        }
        return dp[target];
    }
}

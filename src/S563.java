public class S563 {
    public int backPackV(int[] nums, int target) {
        // write your code here
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = target; j >= 0; j--) {
                if (j >= nums[i])
                    dp[j] += dp[j-nums[i]];
            }
        }
        return dp[target];
    }
}

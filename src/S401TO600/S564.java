package S401TO600;

public class S564 {
    public int backPackVI(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 1; i < target + 1; i++)
            for (int j = 0; j < nums.length; j++)
                if (i - nums[j] >= 0)
                    dp[i] += dp[i - nums[j]];
        return dp[target];
    }
}

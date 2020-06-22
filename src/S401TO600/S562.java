package S401TO600;

public class S562 {
    public int backPackIV(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 0; i < nums.length; i++)
            for (int j = nums[i]; j <= target; j++)
                dp[j] += dp[j - nums[i]];

        return dp[target];
    }
}

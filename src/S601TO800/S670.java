package S601TO800;

public class S670 {
    public boolean PredictTheWinner(int[] nums) {
        int[] dp = new int[nums.length + 1];
        for (int l = nums.length; l >= 0; l--)
            for (int r = l + 1; r < nums.length; r++)
                dp[r] = Math.max(nums[l] - dp[r], nums[r] - dp[r - 1]);
        return dp[nums.length - 1] >= 0;
    }
}

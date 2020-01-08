package S401TO600;

import java.util.Arrays;

public class S588 {
    public boolean canPartition(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        if(sum % 2 == 1)
            return false;
        sum = sum >> 1;
        boolean [] dp = new boolean[sum + 1];
        dp[0] = true;
        for (int num : nums)
            for (int i = sum; i >= num; i--)
                dp[i] |= dp[i - num];
        return dp[sum];
    }
}

package S601TO800;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S603 {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int[] dp = new int[nums.length];
        int mLen = 0;
        int mIdx = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++)
                if (nums[i] % nums[j] == 0 && dp[i] <= dp[j])
                    dp[i] = dp[j] + 1;
            if (mLen < dp[i]) {
                mLen = dp[i];
                mIdx = i;
            }
        }
        List<Integer> res = new ArrayList<Integer>();
        res.add(nums[mIdx]);
        for (int i = mIdx - 1; i >= 0; i--)
            if (res.get(0) % nums[i] == 0)
                res.add(0, nums[i]);
        return res;
    }

    public static void main(String[] args)
    {
        S603 s = new S603();
        int[] nums = new int[] { 2,4,8,9,72 };
        System.out.println(s.largestDivisibleSubset(nums));
    }
}

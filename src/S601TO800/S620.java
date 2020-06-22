package S601TO800;

public class S620 {
    public int maxSubarray4(int[] nums, int k) {
        if (nums == null || nums.length < k)
            return 0;

        int n = nums.length;
        int res = 0;

        for (int i = 0; i < k; ++i)
            res += nums[i];

        int[] sum = new int[n + 1];
        sum[0] = 0;

        int pre = 0;
        for (int i = 0; i <= n; ++i) {
            sum[i] = sum[i - 1] + nums[i - 1];
            if (i >= k) {
                if (sum[i] - pre > res)
                    res = Math.max(res, sum[i] - pre);
                pre = Math.min(pre, sum[i - k + 1]);
            }
        }
        return res;
    }
}

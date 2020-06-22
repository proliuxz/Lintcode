package S601TO800;

public class S617 {
    public double maxAverage(int[] nums, int k) {
        double left = Double.MAX_VALUE;
        double right = Double.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            left = Math.min(left, nums[i]);
            right = Math.max(right, nums[i]);
        }
        while (right - left > 1e-5) {
            double minSum = 0, sum = 0, preSum = 0, mid = left + (right - left) / 2;
            boolean check = false;
            for (int i = 0; i < nums.length; ++i) {
                sum += nums[i] - mid;
                if (i >= k) {
                    preSum += nums[i - k] - mid;
                    minSum = Math.min(minSum, preSum);
                }
                if (i >= k - 1 && sum > minSum) {
                    check = true;
                    break;
                }
            }
            if (check) left = mid;
            else right = mid;
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5, -10, 4};
        int k = 2;
        S617 s = new S617();
        s.maxAverage(nums, k);
    }
}

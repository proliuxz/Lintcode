package S801TO1000;

public class S868 {
    public double findMaxAverage(int[] nums, int k) {
        long sum = 0;
        for (int i = 0; i < k; i++)
            sum += nums[i];
        long res = sum;
        for (int i = 0; i < nums.length - k; i++) {
            sum -= nums[i];
            sum += nums[i + k];
            res = Math.max(res, sum);
        }
        return res * 1.0 / k;
    }
}

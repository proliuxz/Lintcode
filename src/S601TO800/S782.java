package S601TO800;

public class S782 {
    public long getSum(int n, int[] nums) {
        int maxOrSum = nums[0];
        int maxNdSum = nums[0];
        int minOrSum = nums[0];
        int minNdSum = nums[0];
        for (int i = 1; i < n; i++) {
            maxOrSum |= nums[i];
            maxNdSum = Math.max(maxNdSum, nums[i]);
            minOrSum = Math.min(minOrSum, nums[i]);
            minNdSum &= nums[i];
        }
        return (long) maxOrSum + maxNdSum + minOrSum + minNdSum;
    }
}

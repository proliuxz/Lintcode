package S801TO1000;

public class S943 {
    int[] sum;
    public S943(int[] nums) {
        sum = new int[nums.length + 1];
        for (int i = 1; i < sum.length; i++) {
            sum[i] = sum[i-1] + nums[i-1];
        }
    }

    public int sumRange(int i, int j) {
        return sum[j+2] - sum[i+1];
    }
}

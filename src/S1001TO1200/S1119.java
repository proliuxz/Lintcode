package S1001TO1200;

import java.util.Arrays;

public class S1119 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        return Math.max(nums[0] * nums[1], nums[len - 2] * nums[len - 3]) * nums[len - 1];
    }
}

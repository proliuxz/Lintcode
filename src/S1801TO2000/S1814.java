package S1801TO2000;

import java.util.Arrays;

public class S1814 {
    public int SubArraySum(int[] nums) {
        // write your code here
        int result = 0, n = nums.length;
        for(int i = 0;i < n;i++)
            result += (nums[i] * (i + 1) * (n - i));
        return result;
    }
}

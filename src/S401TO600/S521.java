package S401TO600;

import java.util.Arrays;

public class S521 {
    public int deduplication(int[] nums) {
        // write your code here
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);
        int res = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[res]) {
                nums[++res] = nums[i];
            }
        }

        return res + 1;
    }
}

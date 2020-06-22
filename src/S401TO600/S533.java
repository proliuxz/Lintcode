package S401TO600;

import java.util.Arrays;

public class S533 {
    public int twoSumClosest(int[] nums, int target) {
        // write your code here
        if (nums == null || nums.length < 2)
            return -1;
        Arrays.sort(nums);
        int l = 0;
        int r = nums.length - 1;
        int res = Integer.MAX_VALUE;
        int diff = 0;
        while (l < r)
        {
            diff = nums[l] + nums[r] - target;
            res = Math.min(res, Math.abs(diff));
            if (diff == 0)
                return 0;
            else if (diff > 0)
                r--;
            else
                l++;
        }
        return res;
    }
}

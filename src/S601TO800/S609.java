package S601TO800;

import java.util.Arrays;

public class S609 {
    public int twoSum5(int[] nums, int target) {
        if(nums == null || nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int res = 0;
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            if (nums[l] + nums[r] > target)
                r--;
            else {
                res += r - l;
                l ++;
            }
        }
        return res;
    }
}

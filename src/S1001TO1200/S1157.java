package S1001TO1200;

import java.util.Arrays;

public class S1157 {
    public int findUnsortedSubarray(int[] nums) {
        int[] nums2 = nums.clone();
        Arrays.sort(nums2);
        int len = nums.length;
        int l = 0;
        int r = 0;
        while (l < len && nums[l] == nums2[l])
            l++;
        while (r < len && nums[len - 1 - r] == nums2[len - 1 - r])
            r++;
        return Math.max(0, len -l - r);
    }
}

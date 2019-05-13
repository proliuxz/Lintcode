package S401TO600;

import java.util.Arrays;

public class S461 {
    public int kthSmallest(int k, int[] nums) {
        // write your code here
        Arrays.sort(nums);
        return nums[k];
    }
}

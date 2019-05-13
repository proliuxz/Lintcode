package S001TO200;

import java.util.Arrays;

public class S080 {
    public int median(int[] nums) {
        // write your code here
        Arrays.sort(nums);
        return nums[nums.length-1 >>> 1];
    }
}

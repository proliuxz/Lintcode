package S001TO200;

import java.util.Arrays;

public class S005 {
    public int kthLargestElement(int n, int[] nums) {
        // write your code here
        Arrays.sort(nums);
        return nums[nums.length - n];
    }
}

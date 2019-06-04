package S801TO1000;

import java.util.Arrays;

public class S951 {
    public int[] rearrange(int[] nums) {
        // Write your code here
        if (nums == null || nums.length == 0)
            return new int[0];
        int[] res = new int[nums.length];
        Arrays.sort(nums);
        int j = 0;
        for (int i = 0; i < nums.length ; i = i + 2) {
            res[i] = nums[j];
            j++;
        }

        for (int i = 1; i < nums.length; i = i + 2) {
            res[i] = nums[j];
            j++;
        }
        return res;
    }
}

package S801TO1000;

import java.util.Arrays;

public class S993 {
    public int arrayPairSum(int[] nums) {
        // Write your code here
        if(nums == null || nums.length <2)
            return 0;
        Arrays.sort(nums);
        int res = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            res += nums[i];
        }
        return res;
    }
}

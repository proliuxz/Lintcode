package S201TO400;

import java.util.ArrayList;
import java.util.List;

public class S362 {
    public List<Integer> maxSlidingWindow(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0 || k == 0 || k > nums.length)
            return res;

        int max = nums[0];
        int idx = 0;

        for (int i = 1; i < k; i++)
            if (max < nums[i]) {
                max = nums[i];
                idx = -1;
            }

        res.add(max);

        for (int i = 1; i < nums.length - k + 1; i++) {
            if (max < nums[i + k - 1]) {
                max = nums[i + k - 1];
                idx = i + k - 1;
            }
            if (idx < i) {
                max = Integer.MIN_VALUE;
                idx = 0;
                for (int j = 0; j < k; j++)
                    if (max < nums[i + j]) {
                        max = nums[i + j];
                        idx = i + j;
                    }
            }
            res.add(max);
        }
        return res;
    }
}

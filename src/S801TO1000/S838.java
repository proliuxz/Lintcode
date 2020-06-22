package S801TO1000;

import java.util.HashMap;
import java.util.Map;

public class S838 {
    public int subarraySumEqualsK(int[] nums, int k) {
        int res = 0;
        if (nums == null || nums.length == 0)
            return res;
        int[] sums = new int[nums.length];
        sums[0] = nums[0];
        for (int i = 1; i < sums.length; ++i)
            sums[i] = sums[i - 1] + nums[i - 1];
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < sums.length; i++) {
            if (map.containsKey(sums[i] - k))
                res += map.get(sums[i] - k);
            map.put(sums[i], map.getOrDefault(sums[i], 0) + 1);
        }
        return res;
    }
}

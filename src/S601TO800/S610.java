package S601TO800;

import java.util.HashMap;
import java.util.Map;

public class S610 {
    public int[] twoSum7(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i] + target;
            if (map.containsKey(sum)) {
                int index = map.get(sum);
                return new int[] { index + 1, i + 1};
            }

            int diff = nums[i] - target;
            if (map.containsKey(diff)) {
                int index = map.get(diff);
                return new int[] { index + 1, i + 1};
            }
            map.put(nums[i], i);
        }

        return null;
    }
}

package S401TO600;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class S587 {
    public int twoSum6(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.stream(nums).forEach(num -> map.put(num, map.getOrDefault(num, 0) + 1));
        return map.keySet().stream()
                .filter(k -> map.containsKey(target - k))
                .mapToInt(k -> (target == (k << 1) && map.get(k) > 1) ? 2 : 1)
                .sum() >> 1;
    }
}

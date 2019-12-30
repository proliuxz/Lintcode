package S401TO600;

import java.util.*;

public class S548 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.stream(nums1).forEach(num -> map.put(num, map.getOrDefault(num, 0) + 1));
        List<Integer> res = new ArrayList<>();
        Arrays.stream(nums2).filter(map::containsKey).forEach(num -> {
            res.add(num);
            int n = map.get(num);
            if (n > 1)
                map.put(num, n - 1);
            else
                map.remove(num);
        });
        return res.stream().mapToInt(i->i).toArray();
    }
}

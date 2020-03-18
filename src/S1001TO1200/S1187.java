package S1001TO1200;

import java.util.HashSet;
import java.util.Set;

public class S1187 {
    public int findPairs(int[] nums, int k) {
        int res = 0;
        if (nums == null || nums.length < 2)
            return res;
        Set<Integer> set = new HashSet<>();
        Set<Integer> zeroSet = new HashSet<>();
        for (int num: nums) {
            if (!set.add(num))
                zeroSet.add(num);
        }
        if (k == 0)
            return zeroSet.size();
        for (int num: set) {
            if (set.contains(num + k))
                res++;
        }
        return res;
    }
}

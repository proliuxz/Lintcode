package S1601TO1800;

import java.util.HashSet;
import java.util.Set;

public class S1796 {
    public int KDifference(int[] nums, int target) {
        int res = 0;
        Set<Integer> set = new HashSet<>();
        for (int num: nums) {
            if (set.contains(num -target))
                res++;
            if (set.contains(num + target))
                res++;
            set.add(num);
        }
        return res;
    }
}

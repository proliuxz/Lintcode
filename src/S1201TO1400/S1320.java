package S1201TO1400;

import java.util.HashSet;
import java.util.Set;

public class S1320 {
    public boolean containsDuplicate(int[] nums) {
        // Write your code here
        Set<Integer> set = new HashSet<>();
        for (int num: nums
             ) {
            if (!set.add(num))
                return true;
        }
        return false;
    }
}

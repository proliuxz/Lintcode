package S401TO600;

import java.util.HashSet;
import java.util.Set;

public class S547 {
    public int[] intersection(int[] nums1, int[] nums2) {
        // write your code here
        Set<Integer> result = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        for (int num1: nums1
             ) {
            set.add(num1);
        }
        for (int num2: nums2
             ) {
            if (set.contains(num2))
                result.add(num2);
        }
        return result.stream().mapToInt(i->i).toArray();
    }
}

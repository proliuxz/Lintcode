package S1201TO1400;

import java.util.ArrayList;
import java.util.List;

public class S1238 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int num : nums) {
            int index = Math.abs(num) - 1;
            if (nums[index] < 0)
                res.add(Math.abs(num));
            else
                nums[index] = -nums[index];
        }
        return res;
    }
}

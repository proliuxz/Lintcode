package S1201TO1400;

import java.util.ArrayList;
import java.util.List;

public class S1315 {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        int start = 0;
        for (int end = 0; end < nums.length; end++) {
            if (end == nums.length - 1 || nums[end + 1] != nums[end] + 1) {
                if (start == end)
                    res.add(String.valueOf(nums[start]));
                else
                    res.add(nums[start] + "->" + nums[end]);
                start = end + 1;
            }
        }
        return res;
    }
}

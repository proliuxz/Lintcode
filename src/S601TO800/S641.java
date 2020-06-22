package S601TO800;

import java.util.ArrayList;
import java.util.List;

public class S641 {
    List<String> res;
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            AddRange((long)lower - 1, (long)upper + 1);
            return res;
        }
        AddRange((long )lower - 1, nums[0]);
        for (int i = 0; i < nums.length - 1; i++) {
            AddRange(nums[i], nums[i + 1]);
        }
        AddRange(nums[nums.length - 1], (long) upper + 1);
        return res;
    }

    private void AddRange(long l, long r)
    {
        if (r - l < 2)
            return;
        if (r - l == 2)
        {
            res.add(String.valueOf(l + 1));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(l + 1);
        sb.append("->");
        sb.append(r - 1);
        res.add(sb.toString());
    }
}

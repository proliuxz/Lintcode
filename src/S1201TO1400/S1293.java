package S1201TO1400;

import java.util.TreeMap;

public class S1293 {
    public int countRangeSum(int[] nums, int lower, int upper) {
        if (nums == null || nums.length == 0)
            return 0;

        TreeMap<Long, Integer> tree = new TreeMap<>();
        tree.put(0L, 1);
        int count = 0;
        long curSum = 0L;

        for (int num : nums) {
            curSum += num;
            for (int cnt : tree.subMap(curSum - upper, true, curSum - lower, true).values())
                count += cnt;
            tree.put(curSum, tree.getOrDefault(curSum, 0) + 1);
        }
        return count;
    }
}

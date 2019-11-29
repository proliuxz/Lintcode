package S1201TO1400;

import java.util.*;

public class S1210 {
    public List<List<Integer>> findSubsequences(int[] nums) {
        // Write your code here
        Set<List<Integer>> res = new HashSet<>();
        helper(res, new ArrayList<>(), nums, 0);
        return new ArrayList(res);
    }

    private void helper(Set<List<Integer>> res, List<Integer> curr,
                        int[] nums, int pos) {
        if (pos > 1 && curr.size() > 1) {
            res.add(new ArrayList(curr));
        }
        for (int i = pos; i < nums.length; i++) {
            if (curr.size() > 0 && curr.get(curr.size() - 1) > nums[i])
                continue;
            curr.add(nums[i]);
            helper(res, curr, nums, i + 1);
            curr.remove(curr.size() - 1);
        }
    }
}

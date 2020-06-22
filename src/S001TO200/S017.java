package S001TO200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S017 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums, 0, -1, new ArrayList<>(), subsets);
        return subsets;
    }

    private void dfs(int[] nums,
                     int index,
                     int lastSelectedIndex,
                     List<Integer> subset,
                     List<List<Integer>> subsets) {
        if (index == nums.length) {
            subsets.add(new ArrayList<>(subset));
            return;
        }

        dfs(nums, index + 1, lastSelectedIndex, subset, subsets);

        if (index > 0 && nums[index] == nums[index - 1] && index - 1 != lastSelectedIndex)
            return;

        subset.add(nums[index]);
        dfs(nums, index + 1, index, subset, subsets);
        subset.remove(subset.size() - 1);
    }
}

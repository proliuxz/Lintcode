package S1201TO1400;

import java.util.ArrayList;
import java.util.List;

public class S1321 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(ans, new ArrayList<>(), k, 1, n);
        return ans;
    }

    private void helper(List<List<Integer>> res, List<Integer> tmp, int k, int start, int n) {
        if (k == 0) {
            if (n == 0)
                res.add(new ArrayList<>(tmp));
            return;
        }

        for (int i = start; i <= 9; i++) {
            if (n - i == 0 || n > 2 * i)
            {
                tmp.add(i);
                helper(res, tmp, k - 1, i + 1, n - i);
                tmp.remove(tmp.size() - 1);
            }
        }
    }
}

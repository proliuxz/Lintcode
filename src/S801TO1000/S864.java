package S801TO1000;

import Util.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class S864 {
    Map<Integer, Integer> sums = new HashMap<>();

    public boolean checkEqualTree(TreeNode root) {
        int sum = dfs(root);
        if (sum == 0)
            return sums.get(0) > 1;
        return sum % 2 == 0 && sums.containsKey(sum >> 1);
    }

    public int dfs(TreeNode root) {
        if (root == null)
            return 0;
        int sum = root.val + dfs(root.left) + dfs(root.right);
        sums.put(sum, sums.getOrDefault(sum, 0) + 1);
        return sum;
    }
}

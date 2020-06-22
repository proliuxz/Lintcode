package S601TO800;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class S650 {
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        helper(result, root);
        return result;
    }

    private int helper(List<List<Integer>> list, TreeNode root) {
        if (root == null)
            return -1;

        int left = helper(list, root.left);
        int right = helper(list, root.right);
        int cur = Math.max(left, right) + 1;

        if (list.size() <= cur)
            list.add(new ArrayList<>());

        list.get(cur).add(root.val);
        return cur;
    }
}

package S1201TO1400;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class S1357 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        dfs(root, sum, new ArrayList<>());
        return res;
    }

    private void dfs(TreeNode node, int sum, List<Integer> cur)
    {
        if (node == null)
            return;
        cur.add(node.val);
        if (node.left == null && node.right == null && sum == node.val)
        {
            res.add(cur);
            return;
        }
        if (node.left != null)
            dfs(node.left, sum - node.val, new ArrayList<>(cur));
        if (node.right != null)
            dfs(node.right, sum - node.val, new ArrayList<>(cur));
    }
}

package S1401TO1600;

import Util.TreeNode;

public class S1482 {
    public int minimumSum(TreeNode root) {
        return dfs(root);
    }

    public int dfs(TreeNode root) {
        if (root.left == null && root.right == null)
            return root.val;
        if (root.left == null)
            return root.val + dfs(root.right);
        if (root.right == null)
            return root.val + dfs(root.left);
        return root.val + Math.min(dfs(root.left), dfs(root.right));
    }
}

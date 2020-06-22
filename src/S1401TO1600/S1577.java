package S1401TO1600;

import Util.TreeNode;

public class S1577 {
    int res = 0;
    public int sumLeafNode(TreeNode root) {
        dfs(root);
        return res;
    }

    private void dfs(TreeNode node)
    {
        if (node == null)
            return;
        if (node.left == null && node.right == null)
        {
            res += node.val;
            return;
        }
        dfs(node.left);
        dfs(node.right);
    }
}

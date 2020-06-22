package S1201TO1400;

import Util.TreeNode;

public class S1254 {
    int res = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        helper(root,false);
        return res;
    }

    private void helper(TreeNode node, boolean isLeft)
    {
        if (node == null)
            return;

        if (isLeft && node.left == null && node.right == null)
            res += node.val;

        helper(node.left, true);
        helper(node.right, false);
    }
}

package S001TO200;

import Util.TreeNode;

public class S093 {
    public boolean isBalanced(TreeNode root) {
        // write your code here
        return compareHeight(root) != -1;
    }

    public int compareHeight(TreeNode root)
    {
        if (root == null)
            return 0;
        int left = compareHeight(root.left);
        int right = compareHeight(root.right);
        if (left == -1 || right == -1 || Math.abs(left - right) > 1)
            return -1;
        return Math.max(left, right) + 1;
    }
}

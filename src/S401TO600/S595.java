package S401TO600;

import Util.TreeNode;

public class S595 {
    public int longestConsecutive(TreeNode root) {
        // write your code here
        return helper(root, null, 0);
    }

    private int helper(TreeNode root, TreeNode parent, int len) {
        if (root == null)
            return 0;

        int length = (parent != null && parent.val + 1 == root.val)
                ? len + 1
                : 1;
        int left = helper(root.left, root, length);
        int right = helper(root.right, root, length);
        return Math.max(length, Math.max(left, right));
    }
}

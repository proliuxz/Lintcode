package S601TO800;

import Util.TreeNode;

public class S614 {
    public int longestConsecutive2(TreeNode root) {
        // write your code here
        if (root == null)
            return 0;
        int result = helper(root, 1) + helper(root, -1) + 1;
        return Math.max(result, Math.max(longestConsecutive2(root.left), longestConsecutive2(root.right)));
    }

    public int helper(TreeNode node, int lr) {
        if (node == null)
            return 0;
        int left = 0;
        int right = 0;
        if (node.left != null && (node.val - node.left.val == lr))
            left = helper(node.left, lr) + 1;
        if (node.right != null && (node.val - node.right.val == lr))
            right = helper(node.right, lr) + 1;
        return Math.max(left, right);
    }
}

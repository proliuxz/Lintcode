package S1001TO1200;

import Util.TreeNode;

public class S1094 {
    public int findSecondMinimumValue(TreeNode root) {
        if (root == null || (root.left == null && root.right == null))
            return -1;

        int left = root.left.val;
        if (left == root.val)
            left = findSecondMinimumValue(root.left);

        int right = root.right.val;
        if (right == root.val)
            right = findSecondMinimumValue(root.right);

        if (left == -1) {
            return right;
        }

        if (right == -1) {
            return left;
        }

        return Math.min(left, right);
    }
}

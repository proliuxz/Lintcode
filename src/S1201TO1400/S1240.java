package S1201TO1400;

import Util.TreeNode;

public class S1240 {
    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        return pathSum(root.left, sum) + pathSum(root.right, sum) + findPath(root, sum);
    }

    private int findPath(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        int res = 0;
        if (sum == root.val) {
            res += 1;
        }

        res += findPath(root.left, sum - root.val);
        res += findPath(root.right, sum - root.val);
        return res;
    }
}

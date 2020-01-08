package S1001TO1200;

import Util.TreeNode;

public class S1033 {
    int res = Integer.MAX_VALUE;
    Integer pre;
    public int minDiffInBST(TreeNode root) {
        if (root.left != null)
            minDiffInBST(root.left);
        if (pre != null)
            res = Math.min(res, root.val - pre);
        pre = root.val;
        if (root.right != null)
            minDiffInBST(root.right);
        return res;
    }
}

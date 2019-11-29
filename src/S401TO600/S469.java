package S401TO600;

import Util.TreeNode;

public class S469 {
    public boolean isIdentical(TreeNode a, TreeNode b) {
        // write your code here
        if (a == null && b == null)
            return true;
        if (a == null || b == null)
            return false;
        return a.val == b.val && isIdentical(a.left, b.left) && isIdentical(a.right, b.right);
    }
}

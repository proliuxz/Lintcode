package S401TO600;

import Util.TreeNode;

public class S468 {
    public boolean isSymmetric(TreeNode root) {
        // write your code here
        if (root == null)
            return true;
        return isTwoSymmetric(root.left, root.right);
    }

    public boolean isTwoSymmetric(TreeNode tr1, TreeNode tr2)
    {
        if (tr1 == null && tr2 == null)
            return true;
        if (tr1 == null || tr2 == null)
            return false;
        if (tr1.val != tr2.val)
            return false;
        if (!isTwoSymmetric(tr1.left, tr2.right))
            return false;
        if (!isTwoSymmetric(tr1.right, tr2.left))
            return false;
        return true;
    }
}

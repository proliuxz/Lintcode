package S401TO600;

import Util.TreeNode;

public class S578 {
    TreeNode res = null;
    public TreeNode lowestCommonAncestor3(TreeNode root, TreeNode A, TreeNode B) {
        recurseTree(root, A, B);
        return res;
    }

    private boolean recurseTree(TreeNode cur, TreeNode p, TreeNode q) {
        if (cur == null)
            return false;

        int left = this.recurseTree(cur.left, p, q) ? 1 : 0;
        int right = this.recurseTree(cur.right, p, q) ? 1 : 0;
        int mid = (cur == p || cur == q) ? 1 : 0;

        if (mid + left + right >= 2)
            this.res = cur;

        return (mid + left + right > 0);
    }
}

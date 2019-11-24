package S401TO600;

import Util.TreeNode;

public class S453 {
    private TreeNode res = null;

    public void flatten(TreeNode root) {
        // write your code here
        if (root == null)
            return;
        if (res != null) {
            res.left = null;
            res.right = root;
        }
        res = root;
        TreeNode right = root.right;
        flatten(root.left);
        flatten(right);
    }
}

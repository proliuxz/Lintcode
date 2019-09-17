package S1001TO1200;

import Util.TreeNode;

public class S1003 {
    public TreeNode pruneTree(TreeNode root) {
        // Write your code here
        if (root == null)
            return null;
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        return root.val == 0 && root.left == null && root.right == null ? null : root;
    }
}

package S601TO800;

import Util.TreeNode;

public class S726 {
    public boolean isFullTree(TreeNode root) {
        if (root == null)
            return true;

        if (root.left == null && root.right == null)
            return true;

        if (root.left == null || root.right == null)
            return false;

        return isFullTree(root.left) && isFullTree(root.right);
    }
}

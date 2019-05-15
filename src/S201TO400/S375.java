package S201TO400;

import Util.TreeNode;

public class S375 {
    public TreeNode cloneTree(TreeNode root) {
        // write your code here
        if (root == null)
            return null;
        TreeNode newRoot = new TreeNode(root.val);
        if (root.left != null)
            newRoot.left = cloneTree(root.left);
        if (root.right != null)
            newRoot.right = cloneTree(root.right);
        return newRoot;
    }
}

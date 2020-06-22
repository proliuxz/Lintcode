package S601TO800;

import Util.TreeNode;

public class S649 {
    public TreeNode upsideDownBinaryTree(TreeNode root) {
        if (root == null)
            return null;

        return dfs(root);
    }

    private TreeNode dfs(TreeNode node) {
        if (node.left == null)
            return node;
        TreeNode root = dfs(node.left);
        node.left.right = node;
        node.left.left = node.right;
        node.left = null;
        node.right = null;
        return root;
    }
}

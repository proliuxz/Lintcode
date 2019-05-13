package S001TO200;

import Util.TreeNode;

public class S085 {
    public TreeNode insertNode(TreeNode root, TreeNode node) {
        // write your code here
        if (root == null) {
            root = node;
        }
        else if (node.val > root.val)
            root.right = insertNode(root.right, node);
        else
            root.left = insertNode(root.left , node);
        return root;
    }
}

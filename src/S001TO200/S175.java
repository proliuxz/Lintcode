package S001TO200;

import Util.TreeNode;

public class S175 {
    public void invertBinaryTree(TreeNode root) {
        // write your code here
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        if (root.left != null)
            invertBinaryTree(root.left);
        if (root.right != null)
            invertBinaryTree(root.right);
    }
}

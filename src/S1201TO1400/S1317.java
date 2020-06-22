package S1201TO1400;

import Util.TreeNode;

public class S1317 {
    public int countNodes(TreeNode root) {
        return root == null ? 0 : 1 + countNodes(root.left) + countNodes(root.right);
    }
}

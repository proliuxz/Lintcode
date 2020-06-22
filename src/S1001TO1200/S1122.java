package S1001TO1200;

import Util.TreeNode;

public class S1122 {
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if (d < 2) {
            TreeNode node = new TreeNode(v);
            node.left = d == 1 ? root : null;
            node.right = d == 0 ? root : null;
            return node;
        }
        if (root != null && d >= 2) {
            root.left  = addOneRow(root.left,  v, d > 2 ? d - 1 : 1);
            root.right = addOneRow(root.right, v, d > 2 ? d - 1 : 0);
        }
        return root;
    }
}

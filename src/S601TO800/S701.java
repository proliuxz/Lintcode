package S601TO800;

import Util.TreeNode;

public class S701 {
    public TreeNode trimBST(TreeNode root, int minimum, int maximum) {
        if (root == null)
            return null;

        if (root.val < minimum)
            return trimBST(root.right, minimum, maximum);
        else if (root.val > maximum)
            return trimBST(root.left, minimum, maximum);

        root.left = trimBST(root.left, minimum, maximum);
        root.right = trimBST(root.right, minimum, maximum);
        return root;
    }
}

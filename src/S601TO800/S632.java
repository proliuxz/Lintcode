package S601TO800;

import Util.TreeNode;

public class S632 {
    public TreeNode maxNode(TreeNode root) {
        // write your code here
        if (root == null)
            return null;
        TreeNode res = root;
        if (root.left != null)
        {
            TreeNode lMax = maxNode(root.left);
            if (lMax.val > res.val)
                res = lMax;
        }

        if (root.right != null)
        {
            TreeNode rMax = maxNode(root.right);
            if (rMax.val > res.val)
                res = rMax;
        }
        return res;
    }
}

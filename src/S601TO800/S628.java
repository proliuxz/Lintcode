package S601TO800;

import Util.TreeNode;

public class S628 {
    public TreeNode result = null;
    public int value = Integer.MIN_VALUE;

    public TreeNode findSubtree(TreeNode root) {
        // write your code here
        findSubtreeMaxVal(root);
        return result;
    }

    public int findSubtreeMaxVal(TreeNode root) {
        if (root == null)
            return 0;

        int lVal = findSubtreeMaxVal(root.left);
        int rVal = findSubtreeMaxVal(root.right);

        if (result == null || lVal + rVal + root.val > value) {
            value = lVal + rVal + root.val;
            result = root;
        }

        return lVal + rVal + root.val;
    }
}

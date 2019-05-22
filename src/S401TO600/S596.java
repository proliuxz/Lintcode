package S401TO600;

import Util.TreeNode;

public class S596 {
    int value = Integer.MAX_VALUE;
    TreeNode node = null;
    public TreeNode findSubtree(TreeNode root)
    {
        calcValue(root);
        return node;
    }

    public int calcValue(TreeNode node)
    {
        if (node == null)
            return 0;

        int lVal = calcValue(node.left);
        int rVal = calcValue(node.right);
        int sum = lVal + rVal + node.val;
        if (node == null || sum <= value) {
            value = sum;
            this.node = node;
        }
        return sum;
    }
}

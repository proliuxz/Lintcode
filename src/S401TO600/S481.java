package S401TO600;

import Util.TreeNode;

public class S481 {
    int sum = 0;
    public int leafSum(TreeNode root) {
        // write your code
        calcSum(root);
        return sum;
    }

    private void calcSum(TreeNode node)
    {
        if (node == null)
            return;
        if (node.left == null && node.right == null)
            sum += node.val;

        if (node.left != null)
            calcSum(node.left);

        if (node.right != null)
            calcSum(node.right);
    }
}

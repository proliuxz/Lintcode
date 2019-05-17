package S401TO600;

import Util.TreeNode;

public class S482 {
    int sum = 0;
    public int levelSum(TreeNode root, int level) {
        // write your code here
        calcSum(root, level, 1);
        return sum;
    }

    public void calcSum(TreeNode node, int level, int cur)
    {
        if (node == null)
            return;
        if (cur > level)
            return;
        if (cur == level)
            sum += node.val;
        if (node.left != null)
            calcSum(node.left, level, cur + 1);
        if (node.right != null)
            calcSum(node.right, level, cur + 1);
    }
}

package S801TO1000;

import Util.TreeNode;

public class S900 {
    public int closestValue(TreeNode root, double target) {
        if (root == null)
            return 0;

        TreeNode lowerNode = lowerBound(root, target);
        TreeNode upperNode = upperBound(root, target);

        if (lowerNode == null || upperNode == null)
            return lowerNode == null ? upperNode.val : lowerNode.val;

        return target - lowerNode.val > upperNode.val - target?upperNode.val : lowerNode.val;
    }

    private TreeNode lowerBound(TreeNode root, double target) {
        if (root == null)
            return null;
        if (target <= root.val)
            return lowerBound(root.left, target);
        TreeNode lowerNode = lowerBound(root.right, target);
        return lowerNode != null ? lowerNode : root;
    }

    private TreeNode upperBound(TreeNode root, double target) {
        if (root == null)
            return null;
        if (root.val < target)
            return upperBound(root.right, target);
        TreeNode upperNode = upperBound(root.left, target);
        return upperNode != null ? upperNode : root;
    }
}

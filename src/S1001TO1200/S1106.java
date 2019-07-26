package S1001TO1200;

import Util.TreeNode;

public class S1106 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        // Write your code here
        TreeNode root = build(0, nums.length - 1, nums);
        return root;
    }

    private TreeNode build(int left, int right, int[] nums)
    {
        if (left > right)
            return null;
        int rootId = left;
        for (int i = left + 1; i <= right; i++) {
            if (nums[i] > nums[rootId]) {
                rootId = i;
            }
        }
        TreeNode root = new TreeNode(nums[rootId]);
        root.left = build(left, rootId - 1, nums);
        root.right = build(rootId + 1, right, nums);
        return root;
    }
}

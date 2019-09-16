package S1201TO1400;

import Util.TreeNode;

public class S1359 {
    public TreeNode convertSortedArraytoBinarySearchTree(int[] nums) {
        // Write your code here.
        return helper(nums, 0, nums.length - 1);
    }

    public TreeNode helper(int[] nums, int left, int right)
    {
        if (left > right)
            return null;
        if (left == right)
            return new TreeNode(nums[left]);
        int mid = (left + right) >> 1;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums, left, mid - 1);
        node.right = helper(nums, mid + 1, right);
        return node;
    }
}

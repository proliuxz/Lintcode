package S401TO600;

import Util.TreeNode;

public class S535 {
    public int houseRobber3(TreeNode root) {
        // write your code here
        return helper(root, true);
    }

    private int helper(TreeNode root, boolean canRobRoot)
    {
        if (root == null)
            return 0;
        if (canRobRoot == false)
            return helper(root.left, true) + helper(root.right,true);
        else{
            int rob = root.val + helper(root.left, false) + helper(root.right,false);
            int leave = helper(root, false);
            return Math.max(rob, leave);
        }
    }
}

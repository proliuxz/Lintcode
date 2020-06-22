package S1001TO1200;


import Util.TreeNode;

public class S1172 {
    int res = 0;
    public int findTilt(TreeNode root) {
        helper(root);
        return res;
    }

    private int helper(TreeNode root) {
        if(root == null)
            return 0;
        int l = helper(root.left);
        int r = helper(root.right);
        res += Math.abs(l - r);
        return l + r + root.val;
    }
}

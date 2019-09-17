package S1201TO1400;

import Util.TreeNode;

public class S1358 {
    public boolean pathSum(TreeNode root, int sum) {
        // Write your code here.
        if(root == null)
            return sum == 0;
        if(root.left == null && root.right == null)
            return root.val == sum;
        return pathSum(root.left, sum - root.val) || pathSum(root.right, sum - root.val);
    }
}

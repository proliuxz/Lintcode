package S1201TO1400;

import Util.TreeNode;

public class S1353 {
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode root, int prev){
        if(root == null)
            return 0;

        int sum = root.val + prev * 10;
        if(root.left == null && root.right == null)
            return sum;

        return dfs(root.left, sum) + dfs(root.right, sum);
    }
}

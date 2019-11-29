package S601TO800;

import Util.TreeNode;

public class S661 {
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        // write your code here
        dfs(root);
        return root;
    }

    private void dfs(TreeNode node) {
        if (node == null)
            return;
        dfs(node.right);
        sum += node.val;
        node.val = sum;
        dfs(node.left);
    }
}

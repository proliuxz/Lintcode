import Util.TreeNode;

public class S097 {
    public int maxDepth(TreeNode root) {
        // write your code here
        return root == null ? 0 : Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
    }
}

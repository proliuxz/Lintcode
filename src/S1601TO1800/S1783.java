package S1601TO1800;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class S1783 {
    List<Integer> result = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        // write your code here
        helper(root);
        return result;
    }

    private void helper(TreeNode node)
    {
        if (node == null)
            return;
        helper(node.left);
        helper(node.right);
        result.add(node.val);
    }
}

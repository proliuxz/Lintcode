package S001TO200;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class S068 {
    public List<Integer> postorderTraversal(TreeNode root) {
        // write your code here
        List<Integer> res = new ArrayList<>();
        if (root == null)
            return res;
        if (root.left != null)
            res.addAll(postorderTraversal(root.left));
        if (root.right != null)
            res.addAll(postorderTraversal(root.right));
        res.add(root.val);
        return res;
    }
}

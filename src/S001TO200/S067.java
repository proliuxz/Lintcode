package S001TO200;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class S067 {
    public List<Integer> inorderTraversal(TreeNode root) {
        // write your code here
        List<Integer> res = new ArrayList<>();
        if (root == null)
            return res;
        if (root.left != null)
            res.addAll(inorderTraversal(root.left));
        res.add(root.val);
        if (root.right != null)
            res.addAll(inorderTraversal(root.right));
        return res;
    }
}

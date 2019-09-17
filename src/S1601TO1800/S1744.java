package S1601TO1800;

import Util.TreeNode;

import java.util.Stack;

public class S1744 {
    public TreeNode increasingBST(TreeNode root) {
        // Write your code here.
        TreeNode res = null, prev = null;
        TreeNode cur = root;
        Stack<TreeNode> stk = new Stack<>();
        while (cur != null || !stk.isEmpty()) {
            while (cur != null) {
                stk.push(cur);
                cur = cur.left;
            }
            TreeNode n = stk.pop();
            if (res == null) { //output tree doesn't exist; build it
                res = new TreeNode(n.val);
                prev = res;
            } else { //add to output tree
                prev.right = new TreeNode(n.val);
                prev = prev.right;
            }
            cur = n.right;
        }
        return res;
    }
}

package S001TO200;

import Util.TreeNode;

import java.util.Stack;

public class S086 {
    Stack<TreeNode> stack;
    TreeNode next;
    public S086(TreeNode root) {
        stack = new Stack<>();
        next = root;
    }

    public boolean hasNext() {
        if (next != null) {
            TreeNode cur = next;
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            next = null;
        }
        return !stack.isEmpty();
    }

    public TreeNode next() {
        if (!hasNext()) {
            return null;
        }
        TreeNode cur = stack.pop();
        next = cur.right;
        return cur;
    }
}

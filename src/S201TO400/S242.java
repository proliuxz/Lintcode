package S201TO400;

import Util.ListNode;
import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class S242 {
    List<ListNode> res = new ArrayList<>();
    public List<ListNode> binaryTreeToLists(TreeNode root) {
        // Write your code here
        if (root == null)
            return res;
        List<TreeNode> node = new ArrayList<>();
        node.add(root);
        nextLevel(node);
        return res;
    }

    private void nextLevel(List<TreeNode> nodes){
        List<TreeNode> next = new ArrayList<>();
        ListNode fakeHead = new ListNode(0);
        ListNode head = fakeHead;
        for (TreeNode node : nodes) {
            head.next = new ListNode(node.val);
            if (node.left != null)
                next.add(node.left);
            if (node.right != null)
                next.add(node.right);
            head = head.next;
        }
        res.add(fakeHead.next);
        if (next.size() != 0)
            nextLevel(next);
    }
}

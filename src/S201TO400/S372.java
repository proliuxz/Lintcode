package S201TO400;

import Util.ListNode;

public class S372 {
    public void deleteNode(ListNode node) {
        // write your code here
        if (node == null || node.next == null)
        {
            node = null;
            return;
        }
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args)
    {
        S372 s = new S372();
        ListNode node = new ListNode(1);
        s.deleteNode(node);
    }
}

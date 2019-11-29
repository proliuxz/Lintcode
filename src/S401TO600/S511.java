package S401TO600;

import Util.ListNode;

public class S511 {
    public ListNode swapNodes(ListNode head, int v1, int v2) {
        // write your code here
        ListNode node = head;
        ListNode node1 = null;
        ListNode node2 = null;
        while (node != null)
        {
            if (node.val == v1)
                node1 = node;
            if (node.val == v2)
                node2 = node;
            node = node.next;
        }
        if (node1 != null && node2 != null)
        {
            node1.val = v2;
            node2.val = v1;
        }
        return head;
    }
}

package S401TO600;

import Util.ListNode;

public class S599 {
    public ListNode insert(ListNode node, int x) {
        if (node == null)
        {
            node = new ListNode(x);
            node.next = node;
            return node;
        }

        ListNode pre = node;
        ListNode cur = node.next;
        while (cur != node) {
            if (pre.val <= x && cur.val >= x) break;
            if (pre.val > cur.val && (pre.val <= x || cur.val >= x)) break;
            pre = cur;
            cur = cur.next;
        }
        pre.next = new ListNode(x);
        pre.next.next = cur;
        return node;
    }
}

package S201TO400;

import Util.ListNode;

public class S219 {
    public ListNode insertNode(ListNode head, int val) {
        // write your code here
        if (head == null) {
            return new ListNode(val);
        }
        ListNode FakeHead = new ListNode(0);
        FakeHead.next = head;

        head = FakeHead;
        while (head.next != null && head.next.val < val) {
            head = head.next;
        }
        ListNode node = new ListNode(val);
        node.next = head.next;
        head.next = node;
        return FakeHead.next;
    }
}

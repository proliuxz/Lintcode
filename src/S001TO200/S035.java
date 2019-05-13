package S001TO200;

import Util.ListNode;

public class S035 {
    public ListNode reverse(ListNode head) {
        // write your code here
        if (head == null || head.next == null)
            return head;

        ListNode second = head.next;
        head.next = null;
        ListNode rest = reverse(second);
        second.next = head;
        return rest;
    }
}

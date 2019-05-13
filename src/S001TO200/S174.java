package S001TO200;

import Util.ListNode;

public class S174 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // write your code here
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < n ; i++) {
            fast = fast.next;
        }

        if (fast == null)
            return head.next;

        while (fast.next != null)
        {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}

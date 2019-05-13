package S001TO200;

import Util.ListNode;

public class S166 {
    public ListNode nthToLast(ListNode head, int n) {
        // write your code here
        ListNode slow = head;
        ListNode fast = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast != null)
        {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}

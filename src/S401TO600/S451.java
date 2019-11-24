package S401TO600;

import Util.ListNode;

import java.util.List;

public class S451 {
    public ListNode swapPairs(ListNode head) {
        // write your code here
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        head = dummy;
        while (head.next != null && head.next.next != null) {
            ListNode n1 = head.next, n2 = head.next.next;
            head.next = n2;
            n1.next = n2.next;
            n2.next = n1;
            head = n1;
        }

        return dummy.next;
    }
}

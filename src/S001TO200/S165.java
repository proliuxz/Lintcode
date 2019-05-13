package S001TO200;

import Util.ListNode;

public class S165 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // write your code here
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        ListNode fakeHead = new ListNode(0);
        ListNode head = fakeHead;
        while (l1 != null && l2 != null)
        {
            if (l1.val > l2.val)
            {
                head.next = l2;
                l2 = l2.next;
            }
            else {
                head.next = l1;
                l1 = l1.next;
            }
            head = head.next;
        }
        if (l1 != null)
            head.next = l1;
        if (l2 != null)
            head.next = l2;
        return fakeHead.next;
    }
}

package S401TO600;

import Util.ListNode;

public class S452 {
    public ListNode removeElements(ListNode head, int val) {
        // write your code here
        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;
        head = fakeHead;
        while (head != null && head.next != null)
        {
            if (head.next.val == val)
                head.next = head.next.next;
            else {
                head = head.next;
            }
        }
        return fakeHead.next;
    }
}

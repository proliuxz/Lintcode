package S001TO200;

import Util.ListNode;

public class S112 {
    public ListNode deleteDuplicates(ListNode head) {
        // write your code here
        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;
        while (head != null && head.next != null)
        {
            if (head.val == head.next.val)
                head.next = head.next.next;
            else
                head = head.next;
        }
        return fakeHead.next;
    }
}

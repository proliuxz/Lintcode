package S001TO200;

import Util.ListNode;

public class S096 {
    public ListNode partition(ListNode head, int x) {
        // write your code here
        if(head == null)
            return null;
        ListNode l = new ListNode(0);
        ListNode r = new ListNode(0);
        ListNode fakeL = l;
        ListNode fakeR = r;

        while (head != null)
        {
            if (head.val < x) {
                l.next = head;
                l = head;
            } else {
                r.next = head;
                r = head;
            }
            head = head.next;
        }
        r.next = null;
        l.next = fakeR.next;
        return fakeL.next;
    }
}

package S1601TO1800;

import Util.ListNode;

public class S1609 {
    public ListNode middleNode(ListNode head) {
        // write your code here.
        if (head == null)
            return null;
        ListNode mid = head;
        ListNode tail = head;
        while (tail != null && tail.next != null)
        {
            mid = mid.next;
            tail = tail.next.next;
        }
        return mid;
    }
}

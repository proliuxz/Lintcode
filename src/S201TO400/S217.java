package S201TO400;

import Util.ListNode;

import java.util.HashSet;
import java.util.Set;

public class S217 {
    public ListNode removeDuplicates(ListNode head) {
        // write your code here
        if (head == null)
            return null;
        Set<Integer> set = new HashSet();
        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;
        head = fakeHead;
        while (head != null && head.next != null)
        {
            if (set.contains(head.next.val))
                head.next = head.next.next;
            else
            {
                set.add(head.next.val);
                head = head.next;
            }
        }
        return fakeHead.next;
    }
}

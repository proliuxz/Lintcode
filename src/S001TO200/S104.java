package S001TO200;

import Util.ListNode;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class S104 {
    public ListNode mergeKLists(List<ListNode> lists) {
        PriorityQueue<ListNode> pre = new PriorityQueue<>(Comparator.comparingInt(obj -> obj.val));
        for (ListNode head : lists) {
            if (head != null)
                pre.offer(head);
        }
        ListNode fakeHead = new ListNode(0);
        ListNode p = fakeHead;
        while (!pre.isEmpty()) {
            ListNode cur = pre.poll();
            p.next = new ListNode(cur.val);
            if (cur.next != null)
                pre.offer(cur.next);
            p = p.next;
        }
        return fakeHead.next;
    }
}

import Util.ListNode;

public class S173 {
    public ListNode insertionSortList(ListNode head) {
        // write your code here
        if (head==null)
            return null;
        ListNode cur = head;
        ListNode fakeHead = new ListNode(0);
        ListNode pre;
        while (cur!=null)
        {
            ListNode pos = cur.next;
            pre = fakeHead;
            while (pre.next != null && pre.next.val < cur.val)
            {
                pre = pre.next;
            }
            cur.next = pre.next;
            pre.next = cur;
            cur = pos;
        }
        return fakeHead.next;
    }
}

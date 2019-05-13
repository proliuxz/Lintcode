package S001TO200;

import Util.ListNode;

public class S167 {
    public ListNode addLists(ListNode l1, ListNode l2) {
        // write your code here
        return add(l1, l2, true);
    }

    private ListNode add(ListNode l1, ListNode l2, boolean c)
    {
        if (l1 == null)
        {
            if (c == false)
                return l2;
            else
                return add(l2, new ListNode(1), false);
        }
        if (l2 == null)
        {
            if (c == false)
                return l1;
            else
                return add(l1, new ListNode(1), false);
        }
        int num = l1.val + l2.val + (c ? 1 : 0);
        ListNode cur = new ListNode(num % 10);
        cur.next = add(l1.next, l2.next, (num > 9 ? true : false));
        return cur;
    }
}

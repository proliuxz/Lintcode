package S401TO600;

import Util.ListNode;

public class S450 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode cur = head, tmp = head, prev = null;
        for(int i = 0 ; i < k; i++, tmp = tmp.next)
            if(tmp == null)
                return head;
        for(int i = 0; i < k; i++){
            tmp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = tmp;
        }
        head.next = reverseKGroup(cur, k);
        return prev;
    }
}

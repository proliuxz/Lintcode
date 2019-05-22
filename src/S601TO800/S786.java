package S601TO800;

import Util.ListNode;

public class S786 {
    public int weightedSumReverse(ListNode head) {
        // ListNode -> val: the value of node ,ListNode -> next: the next node of this node
        int res = 0;
        int sum = 0;
        while (head != null)
        {
            sum += head.val;
            res += sum;
            head = head.next;
        }
        return res;
    }
}

import Util.ListNode;

import java.util.HashMap;

public class SS1661 {
    public ListNode deleteNode(ListNode head, int n, int m) {
        // Write your code here
        if (head == null)
            return null;
        ListNode preNode = head;
        ListNode curNode = head;

        if (n == 0) {
            for (int j = 0; j < m; j++) {
                curNode = curNode.next;
            }
            return curNode.next;
        }

        for (int i = 0; i < n - 1; i++) {
            preNode = preNode.next;
        }

        for (int j = 0; j < m; j++) {
            curNode = curNode.next;
        }
        preNode.next = curNode.next;
        return head;
    }
}

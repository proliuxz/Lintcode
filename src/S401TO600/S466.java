package S401TO600;

import Util.ListNode;

public class S466 {
    public int countNodes(ListNode head) {
        // write your code here
        if (head == null)
            return 0;
        if (head.next == null)
            return 1;
        return countNodes(head.next) + 1;
    }
}

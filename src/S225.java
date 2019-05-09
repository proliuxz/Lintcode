import Util.ListNode;

public class S225 {
    public ListNode findNode(ListNode head, int val) {
        // write your code here
        if (head == null)
            return null;
        if (head.val == val)
            return head;
        return findNode(head.next, val);
    }
}

import Util.ListNode;

public class SS1664 {
    public int countNodesII(ListNode head) {
        int count = 0;
        if(head == null)
            return count;
        if (head.val > 0 && head.val %2 == 1)
            count++;
        while (head.next != null)
        {
            head = head.next;
            if (head.val > 0 && head.val %2 == 1)
                count++;
        }
        return count;
    }
}

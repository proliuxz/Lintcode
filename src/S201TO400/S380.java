package S201TO400;

import Util.ListNode;

import java.util.HashSet;
import java.util.Set;

public class S380 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // write your code here
        Set<ListNode> set = new HashSet<>();
        while (headA != null)
        {
            set.add(headA);
            headA = headA.next;
        }

        while (headB != null)
        {
            if(set.contains(headB))
                return headB;
            else
                headB = headB.next;
        }
        return null;
    }
}

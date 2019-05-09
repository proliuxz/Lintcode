import Util.ListNode;

import java.util.ArrayList;
import java.util.List;

public class S483 {
    public List<Integer> toArrayList(ListNode head) {
        // write your code here
        List<Integer> res = new ArrayList<>();
        while (head != null)
        {
            res.add(head.val);
            head = head.next;
        }
        return res;
    }
}

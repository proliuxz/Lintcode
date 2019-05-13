package S801TO1000;

import Util.ListNode;

import java.util.ArrayList;
import java.util.List;

public class S822 {
    public List<Integer> reverseStore(ListNode head) {
        // write your code here
        List<Integer> res = new ArrayList<>();
        if(head == null)
            return res;
        while (head != null)
        {
            res.add(0, head.val);
            head = head.next;
        }
        return res;
    }
}

package S1201TO1400;

import Util.ListNode;

import java.util.HashSet;
import java.util.Set;

public class S1371 {
    public int numComponents(ListNode head, int[] G) {
        // Write your code here
        int result = 0;
        Set<Integer> set = new HashSet<>();
        for (int g: G) {
            set.add(g);
        }

        ListNode cur = head;
        boolean isComponent = false;

        while (cur != null)
        {
            if (!set.contains(cur.val))
                isComponent = false;
            else {
                result = (isComponent == false) ? (result + 1) : result;
                isComponent = true;
            }
            cur = cur.next;
        }
        return result;
    }
}

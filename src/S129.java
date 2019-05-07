import Util.ListNode;

import java.util.Arrays;

public class S129 {
    public ListNode[] rehashing(ListNode[] hashTable) {
        // write your code here
        int size = hashTable.length;
        if (size == 0)
            return null;
        int size2 = 2 * size;
        ListNode[] result = new ListNode[size2];
        Arrays.fill(result, null);

        for (int i = 0; i < size ; i++) {
            ListNode cur = hashTable[i];
            while (cur != null)
            {
                ListNode tmp = cur;
                cur = cur.next;
                int val = (tmp.val % size2 + size2) % size2;
                if (result[val] == null)
                {
                    result[val] = tmp;
                    tmp.next = null;
                }
                else
                {
                    ListNode p = result[val];
                    while (p.next != null)
                        p = p.next;
                    p.next = tmp;
                    tmp.next = null;
                }
            }
        }
        return result;
    }
}

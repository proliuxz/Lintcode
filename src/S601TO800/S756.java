package S601TO800;

import Util.ListNode;

public class S756 {
    public long multiplyLists(ListNode l1, ListNode l2) {
        // write your code here
        if(l1 == null || l2 == null)
            return 0;
        long result = 0;
        ListNode l2bk = l2;
        while (l1 != null)
        {
            result *= 10;
            long tmp = 0;

            while (l2 != null)
            {
                tmp *= 10;
                tmp += l2.val * l1.val;
                l2 = l2.next;
            }
            result += tmp;
            l1 = l1.next;
            l2 = l2bk;
        }
        return result;
    }

    public static void main(String[] args)
    {
        ListNode l1 = ListNode.BuildHelper(new int[] {9,4,6});
        ListNode l2 = ListNode.BuildHelper(new int[] {8,4});
        S756 s = new S756();
        var res = s.multiplyLists(l1,l2);
        System.out.println(res);
    }
}

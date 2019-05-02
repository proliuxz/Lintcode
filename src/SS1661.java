import Util.ListNode;

public class SS1661 {
    public ListNode deleteNode(ListNode head, int n, int m) {
        // Write your code here
        ListNode FakeHead = new ListNode(0);
        FakeHead.next = head;
        ListNode s = findNode(head, n - 1);
        ListNode e = findNode(head, n + m + 2);
        if (s == null)
            return e;
        s.next = e;
        return FakeHead.next;
    }

    private ListNode findNode(ListNode head, int num)
    {
        if(head == null || head.next == null || num < 0)
            return null;
        int count = 0;
        while (count < num)
        {
            if(head.next == null)
                return null;
            head = head.next;
            count++;
        }
        return head;
    }

    public static void main(String[] args)
    {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        SS1661 s = new SS1661();
//        ListNode n = s.deleteNode(n1,0);
//        System.out.println(n.val);
    }
}

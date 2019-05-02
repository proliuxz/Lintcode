import Util.ListNode;

import java.util.List;

public class S228 {
    public ListNode middleNode(ListNode head) {
        // write your code here
        if(head == null || head.next == null)
            return head;

        ListNode mid = head;
        ListNode tail = head.next;

        while(tail != null && tail.next != null){
            mid = mid.next;
            tail = tail.next.next;
        }
        return mid;
    }

    public static void main(String[] args)
    {
        S228 s = new S228();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;

        ListNode l4 = new ListNode(1);
        ListNode l5 = new ListNode(2);
        ListNode l6 = new ListNode(3);
        ListNode l7 = new ListNode(4);
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;

        System.out.println(s.middleNode(l1).val);
        System.out.println(s.middleNode(l4).val);
    }
}

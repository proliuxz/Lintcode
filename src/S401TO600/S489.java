package S401TO600;

import Util.ListNode;

import java.util.List;

public class S489 {
    public ListNode toLinkedList(List<Integer> nums) {
        // write your code here
        if (nums == null || nums.size() == 0)
            return null;
        ListNode fakeHead = new ListNode(0);
        ListNode head = fakeHead;
        for (int i = 0; i < nums.size() ; i++) {
            head.next = new ListNode(nums.get(i));
            head = head.next;
        }
        return fakeHead.next;
    }
}

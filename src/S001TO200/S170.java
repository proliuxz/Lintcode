package S001TO200;

import Util.ListNode;

public class S170 {
    public ListNode rotateRight(ListNode head, int k) {
        // write your code here
        if(k==0 || head == null)
            return head;
        int len = 1;
        ListNode node = head;
        ListNode prev = head;

        while(node.next!=null){
            len+=1;
            node=node.next;
        }

        if(k==len || k%len == 0)
            return head;

        node.next = head;
        node = head;
        int t = k % len;
        for(int i = 0; i < len - t; i++){
            prev = node;
            node = node.next;
        }
        prev.next = null;
        return node;
    }
}

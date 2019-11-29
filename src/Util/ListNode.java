package Util;

public class ListNode {
  public int val;
  public ListNode next;
  public ListNode(int x) {
      val = x;
      next = null;
  }

    public static ListNode BuildHelper(int[] arr)
    {
        ListNode fakeHead = new ListNode(0);
        ListNode last = fakeHead;
        for (int i = 0; i < arr.length; i++) {
            ListNode node = new ListNode(arr[i]);
            last.next = node;
            last = last.next;
        }
        return fakeHead.next;
    }
}

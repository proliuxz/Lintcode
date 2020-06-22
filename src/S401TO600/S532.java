package S401TO600;

class Node{
    public Node left;
    public Node right;
    public int val;
    public long count;
    public Node(int v){
        val = v;
        count = 1;
    }
}
public class S532 {
    private Node insert(Node head, int val)
    {
        if (head == null)
            return new Node(val);
        else if (val == head.val)
            head.count++;
        else if (val < head.val)
            head.left = insert(head.left, val);
        else {
            head.count++;
            head.right = insert(head.right, val);
        }
        return head;
    }

    private long search(Node head, int target)
    {
        if (head == null)
            return 0;
        else if (target == head.val)
            return head.count;
        else if (target < head.val)
            return head.count + search(head.left, target);
        else
            return search(head.right, target);
    }

    public long reversePairs(int[] A) {
        // write your code here
        Node head = null;
        int n = A.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            count += search(head, A[i] + 1);
            head = insert(head, A[i]);
        }
        return count;
    }
}

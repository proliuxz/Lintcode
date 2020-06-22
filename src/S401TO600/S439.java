package S401TO600;

class SegmentTreeNode {
      public int start, end, max;
      public SegmentTreeNode left, right;
      public SegmentTreeNode(int start, int end, int max) {
          this.start = start;
          this.end = end;
          this.max = max;
          this.left = this.right = null;
      }
}

public class S439 {
    public SegmentTreeNode build(int[] A) {
        return build(0, A.length - 1, A);
    }

    public SegmentTreeNode build(int start, int end, int[] A) {
        if (start > end)
            return null;
        if (start == end)
            return new SegmentTreeNode(start, end, A[start]);
        SegmentTreeNode node = new SegmentTreeNode(start, end, A[start]);
        int mid = (start + end) >> 1;
        node.left = build(start, mid, A);
        node.right = build(mid + 1, end, A);
        if (node.left != null)
            node.max = Math.max(node.max, node.left.max);
        if (node.right != null)
            node.max = Math.max(node.max, node.right.max);
        return node;
    }
}

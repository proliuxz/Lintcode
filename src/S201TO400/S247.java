package S201TO400;



public class S247 {
    class SegmentTreeNode {
        public int start, end, count;
        public SegmentTreeNode left, right;

        public SegmentTreeNode(int start, int end, int count) {
            this.start = start;
            this.end = end;
            this.count = count;
            this.left = this.right = null;
        }
    }

    public int query(SegmentTreeNode root, int start, int end) {
        if (root == null)
            return 0;
        if (start <= root.start && root.end <= end)
            return root.count;

        int mid = (root.start + root.end) >> 1;
        int lCnt = 0;
        int rCnt = 0;

        if(start <= mid)
            lCnt = query(root.left, start, Math.min(mid,end));
        if(mid < end)
            rCnt = query(root.right, Math.max(mid+1,start), end);

        return lCnt + rCnt;
    }
}

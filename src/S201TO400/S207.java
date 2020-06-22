package S201TO400;

public class S207 {
    class SegmentTreeNode {
        public int start, end;
        public int sum;
        public SegmentTreeNode left, right;
        public SegmentTreeNode(int start, int end, int sum) {
            this.start = start;
            this.end = end;
            this.sum = sum;
            this.left = this.right = null;
        }
    }

    public SegmentTreeNode build(int start, int end, int[] A) {
        if(start > end)
            return null;
        SegmentTreeNode root = new SegmentTreeNode(start, end, 0);
        if(start != end) {
            int mid = (start + end) >> 1;
            root.left = build(start, mid, A);
            root.right = build(mid+1, end, A);
            root.sum = root.left.sum + root.right.sum;
        } else
            root.sum =  A[start];
        return root;
    }

    public int querySegmentTree(SegmentTreeNode root, int start, int end) {
        if(start == root.start && root.end == end)
            return root.sum;
        int mid = (root.start + root.end) >> 1;
        int leftsum = 0;
        int rightsum = 0;
        if(start <= mid)
            leftsum =  querySegmentTree(root.left, start, Math.min(mid,end));
        if(mid < end)
            rightsum = querySegmentTree(root.right, Math.max(start, mid+1), end);
        return leftsum + rightsum;
    }

    public void modifySegmentTree(SegmentTreeNode root, int index, int value) {
        if(root.start == index && root.end == index) { // 查找到
            root.sum = value;
            return;
        }
        int mid = (root.start + root.end) >> 1;
        if(root.start <= index && index <=mid)
            modifySegmentTree(root.left, index, value);
        if(mid < index && index <= root.end)
            modifySegmentTree(root.right, index, value);
        root.sum = root.left.sum + root.right.sum;
    }
    SegmentTreeNode root;
    public S207(int[] A) {
        root =  build(0, A.length, A);
    }

    public long query(int start, int end) {
        return querySegmentTree(root, start, end);
    }

    public void modify(int index, int value) {
        modifySegmentTree(root, index, value);
    }
}

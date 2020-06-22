package S201TO400;

import Util.Interval;

import java.util.ArrayList;
import java.util.List;

public class S206 {
    class SegmentTreeNode {
        public int start, end;
        public long sum;
        public SegmentTreeNode left, right;

        public SegmentTreeNode(int start, int end, long sum) {
            this.start = start;
            this.end = end;
            this.sum = sum;
            this.left = this.right = null;
        }
    }

    public SegmentTreeNode build(int start, int end, int[] A) {
        // write your code here
        if(start > end)
            return null;

        SegmentTreeNode root = new SegmentTreeNode(start, end, 0L);

        if(start != end) {
            int mid = (start + end) / 2;
            root.left = build(start, mid, A);
            root.right = build(mid+1, end, A);

            root.sum = root.left.sum + root.right.sum;
        } else
            root.sum =  Long.valueOf(A[start]);

        return root;
    }
    public Long query(SegmentTreeNode root, int start, int end) {
        // write your code here
        if(start == root.start && root.end == end)
            return root.sum;

        int mid = (root.start + root.end)/2;
        Long leftsum = 0L;
        Long rightsum = 0L;

        if(start <= mid)
            leftsum =  query(root.left, start, Math.min(mid, end));

        if(mid < end)
            rightsum = query(root.right, Math.max(start, mid+1), end);

        return leftsum + rightsum;
    }
    public List<Long> intervalSum(int[] A, List<Interval> queries) {
        SegmentTreeNode root = build(0, A.length - 1, A);
        ArrayList ans = new ArrayList<Long>();
        for(Interval in : queries)
            ans.add(query(root, in.start, in.end));
        return ans;
    }
}

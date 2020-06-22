package S201TO400;

import Util.Interval;

import java.util.ArrayList;
import java.util.List;

public class S205 {
    class SegmentTreeNode {
        public int start, end, min;
        public SegmentTreeNode left, right;
        public SegmentTreeNode(int start, int end, int min) {
            this.start = start;
            this.end = end;
            this.min = min;
            this.left = this.right = null;
        }
    }

    public SegmentTreeNode build(int start, int end, int[] A) {
        if(start > end)
            return null;

        SegmentTreeNode root = new SegmentTreeNode(start, end, Integer.MAX_VALUE);
        if(start != end) {
            int mid = (start + end) / 2;
            root.left = build(start, mid, A);
            root.right = build(mid+1, end, A);
            root.min = Math.min(root.left.min, root.right.min);
        } else
            root.min = A[start];
        return root;
    }

    public int query(SegmentTreeNode root, int start, int end) {
        if(start == root.start && root.end == end)
            return root.min;

        int mid = (root.start + root.end)/2;
        int leftmin = Integer.MAX_VALUE;
        int rightmin = Integer.MAX_VALUE;

        if(start <= mid)
            leftmin =  query(root.left, start, Math.min(mid,end));

        if(mid < end)
            rightmin = query(root.right, Math.max(start, mid+1), end);

        return Math.min(leftmin, rightmin);
    }

    public List<Integer> intervalMinNumber(int[] A, List<Interval> queries) {
        SegmentTreeNode root = build(0, A.length -1, A);
        List<Integer> ans = new ArrayList<>();
        for(Interval in : queries)
            ans.add(query(root, in.start, in.end));
        return ans;
    }
}

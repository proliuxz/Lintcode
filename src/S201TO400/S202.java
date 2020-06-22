package S201TO400;

import Util.SegmentTreeNode;

public class S202 {
    public int query(SegmentTreeNode root, int start, int end) {
        if (root.start == start && root.end == end)
            return root.max;

        int mid = (root.start + root.end) >> 1;
        int lMax = Integer.MIN_VALUE;
        int rMax = Integer.MIN_VALUE;

        if(start <= mid)
            lMax = query(root.left, start, Math.min(mid,end));

        if(mid < end)
            rMax = query(root.right, Math.max(mid+1,start), end);

        return Math.max(lMax, rMax);
    }
}

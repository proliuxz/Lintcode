package S201TO400;

import Util.SegmentTreeNode;

public class S201 {
    public SegmentTreeNode build(int start, int end) {
        if (start > end)
            return null;
        SegmentTreeNode node = new SegmentTreeNode(start, end);
        if (start != end)
        {
            int mid = (start + end) >> 1;
            node.left = build(start, mid);
            node.right = build(mid + 1, end);
        }
        return node;
    }
}

package S201TO400;

import java.util.ArrayList;
import java.util.List;

public class S249 {
    class SegmentTreeNode {
        public int start, end;
        public int cnt;
        public SegmentTreeNode left, right;
        public SegmentTreeNode(int start, int end, int sum) {
            this.start = start;
            this.end = end;
            this.cnt = sum;
            this.left = this.right = null;
        }
    }

    public SegmentTreeNode build(int start, int end) {
        if(start > end)
            return null;
        SegmentTreeNode root = new SegmentTreeNode(start, end, 0);
        if(start != end) {
            int mid = (start + end) >> 1;
            root.left = build(start, mid);
            root.right = build(mid+1, end);
            root.cnt = root.left.cnt;
        } else
            root.cnt = 0;
        return root;
    }

    public int querySegmentTree(SegmentTreeNode root, int start, int end) {
        if(start == root.start && root.end == end)
            return root.cnt;
        int mid = (root.start + root.end) >> 1;
        int lCnt = 0;
        int rCnt = 0;
        if(start <= mid)
            lCnt =  querySegmentTree(root.left, start, Math.min(mid,end));
        if(mid < end)
            rCnt = querySegmentTree(root.right, Math.max(start, mid+1), end);
        return lCnt + rCnt;
    }

    public void modifySegmentTree(SegmentTreeNode root, int index, int value) {
        if(root.start == index && root.end == index) { // 查找到
            root.cnt += value;
            return;
        }
        int mid = (root.start + root.end) >> 1;
        if(root.start <= index && index <=mid)
            modifySegmentTree(root.left, index, value);
        if(mid < index && index <= root.end)
            modifySegmentTree(root.right, index, value);
        root.cnt = root.left.cnt + root.right.cnt;
    }
    SegmentTreeNode root;
    public List<Integer> countOfSmallerNumberII(int[] A) {
        root = build(0, 10000);
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < A.length; i++) {
            int tmp = 0;
            if(A[i] > 0)
                tmp = querySegmentTree(root, 0, A[i]-1);
            modifySegmentTree(root, A[i], 1);
            res.add(tmp);
        }
        return res;
    }
}

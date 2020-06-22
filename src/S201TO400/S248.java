package S201TO400;

import java.util.ArrayList;

public class S248 {
    public class SegmentTreeNode {
        public int start, end, count;
        public SegmentTreeNode left, right;

        public SegmentTreeNode(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public SegmentTreeNode(int start, int end, int max) {
            this.start = start;
            this.end = end;
            this.count = max;
            this.left = this.right = null;
        }
    }
    SegmentTreeNode root;
    public SegmentTreeNode build(int start, int end) {
        if(start > end)
            return null;

        SegmentTreeNode root = new SegmentTreeNode(start, end, 0);
        if(start != end) {
            int mid = (start + end) / 2;
            root.left = build(start, mid);
            root.right = build(mid+1, end);
        } else
            root.count =  0;
        return root;
    }

    public int querySegmentTree(SegmentTreeNode root, int start, int end) {
        // write your code here
        if(start == root.start && root.end == end)
            return root.count;

        int mid = (root.start + root.end)/2;
        int lCnt = 0;
        int rCnt = 0;
        if(start <= mid)
            lCnt =  querySegmentTree(root.left, start, Math.min(mid, end));

        if(mid < end)
            rCnt = querySegmentTree(root.right, Math.max(start, mid + 1), end);

        return lCnt + rCnt;
    }
    public void modifySegmentTree(SegmentTreeNode root, int index, int value) {
        if(root.start == index && root.end == index) { // 查找到
            root.count += value;
            return;
        }

        int mid = (root.start + root.end) / 2;

        if(root.start <= index && index <=mid) {
            modifySegmentTree(root.left, index, value);
        }

        if(mid < index && index <= root.end) {
            modifySegmentTree(root.right, index, value);
        }

        root.count = root.left.count + root.right.count;
    }
    public ArrayList<Integer> countOfSmallerNumber(int[] A, int[] queries) {
        root = build(0, 10000);
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int res;
        for(int i = 0; i < A.length; i++)
            modifySegmentTree(root, A[i], 1);

        for(int i = 0; i < queries.length; i++) {
            res = 0;
            if(queries[i] > 0)
                res = querySegmentTree(root, 0, queries[i] - 1);
            ans.add(res);
        }
        return ans;
    }
}

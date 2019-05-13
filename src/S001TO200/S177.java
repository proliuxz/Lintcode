package S001TO200;

import Util.TreeNode;

public class S177 {
    public TreeNode sortedArrayToBST(int[] A) {
        // write your code here
        if(A == null || A.length == 0)
            return null;
        int len = A.length;
        TreeNode root = null;
        root = recursion(A, 1, len, root);
        A = null;
        return root;
    }

    public TreeNode recursion(int[] array, int l, int r, TreeNode root)
    {
        if(l <= r)
        {
            int mid = (l + r + 1) >> 1;
            root = new TreeNode(array[mid-1]);
            root.left = recursion(array, l, mid - 1, root.left);
            root.right = recursion(array, mid + 1, r, root.right);
        }
        return root;
    }
}

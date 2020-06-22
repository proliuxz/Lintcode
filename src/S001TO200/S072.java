package S001TO200;

import Util.TreeNode;

import java.util.Arrays;

public class S072 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length != postorder.length)
            return null;
        return helper(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    private TreeNode helper(int[] i, int is, int ie, int[] p, int ps, int pe) {
        if (is > ie)
            return null;
        TreeNode root = new TreeNode(p[pe]);
        int idx = findPosition(i, is, ie, p[pe]);
        root.left = helper(i, is, idx - 1, p, ps, ps + idx - is - 1);
        root.right = helper(i, idx + 1, ie, p, ps + idx - is, pe - 1);
        return root;
    }

    private int findPosition(int[] arr, int start, int end, int key) {
        int i;
        for (i = start; i <= end; i++)
            if (arr[i] == key)
                return i;
        return -1;
    }
}

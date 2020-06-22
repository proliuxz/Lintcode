package S601TO800;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class S689 {
    public int[] twoSum(TreeNode root, int n) {
        List<Integer> list = new ArrayList();
        inorder(root, list);
        int l = 0, r = list.size() - 1;
        while (l < r) {
            int nl = list.get(l);
            int nr = list.get(r);
            int sum = nl + nr;
            if (sum == n)
                return new int[]{nl, nr};
            if (sum < n)
                l++;
            else
                r--;
        }
        return null;
    }

    public void inorder(TreeNode root, List<Integer> list) {
        if (root == null)
            return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}

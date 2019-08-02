package S1401TO1600;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class S1588 {
    public List<TreeNode> allPossibleFBT(int n) {
        // write your code here
        List<TreeNode> ans = new ArrayList<>();
        if (n % 2 == 0) {
            return ans;
        }

        if (n == 1) {
            TreeNode head = new TreeNode(0);
            ans.add(head);
            return ans;
        }

        for (int i = 1; i < n; i += 2) {
            List<TreeNode> left = allPossibleFBT(i);
            List<TreeNode> right = allPossibleFBT(n - 1 - i);
            for (TreeNode l : left) {
                for (TreeNode r : right) {
                    TreeNode head = new TreeNode(0);
                    head.left = l;
                    head.right = r;
                    ans.add(head);
                }
            }
        }
        return ans;
    }
}

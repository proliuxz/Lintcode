package S601TO800;

import Util.MultiTreeNode;

public class S619 {
    public int longestConsecutive3(MultiTreeNode root) {
        if (root == null)
            return 0;
        int res = helper(root, 1) + helper(root, -1) + 1;
        for (MultiTreeNode child : root.children) {
            res = Math.max(res, longestConsecutive3(child));
        }
        return res;
    }

    public int helper(MultiTreeNode node, int lr) {
        if (node == null)
            return 0;
        int res = 0;
        for (MultiTreeNode child : node.children) {
            if (node != null && (node.val - child.val == lr))
                res = Math.max(res, helper(child, lr) + 1);
        }
        return res;
    }
}

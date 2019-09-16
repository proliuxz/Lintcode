package S1201TO1400;

import Util.TreeNode;

public class S1311 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // write your code here
        int parentVal = root.val;
        // Value of p
        int pVal = p.val;
        // Value of q;
        int qVal = q.val;
        if (pVal > parentVal && qVal > parentVal) {
            // If both p and q are greater than parent
            return lowestCommonAncestor(root.right, p, q);
        } else if (pVal < parentVal && qVal < parentVal) {
            // If both p and q are lesser than parent
            return lowestCommonAncestor(root.left, p, q);
        } else {
            // We have found the split point, i.e. the LCA node.
            return root;
        }
    }
}

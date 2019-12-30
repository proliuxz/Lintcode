package S1401TO1600;

import Util.TreeNode;

public class S1524 {
    public TreeNode searchBST(TreeNode root, int val) {
        // Write your code here.
        return root==null||root.val==val?root:(root.val>val?searchBST(root.left, val):searchBST(root.right,val));
    }
}

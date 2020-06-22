package S1001TO1200;

import Util.TreeNode;

public class S1165 {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null)
            return t == null;
        if(s.val == t.val && compare(s,t) )
            return true;
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    private boolean compare(TreeNode s, TreeNode t) {
        if(s == null)
            return t == null;
        if(t == null || s.val != t.val)
            return false;
        return compare(s.left, t.left) && compare(s.right, t.right);
    }
}

package S1001TO1200;

import Util.TreeNode;

public class S1137 {
    public String tree2str(TreeNode t) {
        StringBuilder sb = new StringBuilder();
        if(t == null)
            return new String();
        sb.append(t.val);
        if (t.left != null || t.right != null)
        {
            sb.append("(");
            sb.append(tree2str(t.left));
            sb.append(")");
        }
        if (t.right != null)
        {
            sb.append("(");
            sb.append(tree2str(t.right));
            sb.append(")");
        }
        return sb.toString();
    }
}

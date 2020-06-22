package S601TO800;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class S760 {
    List<Integer> res;
    public List<Integer> rightSideView(TreeNode root) {
        res = new ArrayList<>();
        List<TreeNode> list = new ArrayList<>();
        if (root == null)
            return res;
        list.add(root);
        nextLevel(list);
        return res;
    }

    public void nextLevel(List<TreeNode> cur)
    {
        List<TreeNode> next = new ArrayList<>();
        if (!cur.isEmpty()) {
            res.add(cur.get(cur.size() - 1).val);
            for (TreeNode node: cur)
            {
                if (node.left != null)
                    next.add(node.left);
                if (node.right != null)
                    next.add(node.right);
            }
            nextLevel(next);
        }
    }
}

package S001TO200;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class S069 {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        // write your code here
        if (root == null)
            return result;
        List<TreeNode> nodes = new ArrayList<>();
        nodes.add(root);
        nextLevel(nodes);
        return result;
    }

    public void nextLevel(List<TreeNode> nodes)
    {
        List<TreeNode> next = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        for (TreeNode node : nodes)
        {
            cur.add(node.val);
            if (node.left != null)
                next.add(node.left);
            if (node.right != null)
                next.add(node.right);
        }
        result.add(cur);
        if(next.size() != 0)
            nextLevel(next);
    }
}

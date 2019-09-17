package S1001TO1200;

import Util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class S1197 {
    public int findBottomLeftValue(TreeNode root) {
        // write your code here
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        int result = root.val;
        while (!nodes.isEmpty())
        {
            Queue<TreeNode> nextLevel = new LinkedList<>();
            result = nodes.peek().val;
            for (TreeNode node : nodes)
            {
                if (node.left != null)
                    nextLevel.add(node.left);
                if (node.right != null)
                    nextLevel.add(node.right);
            }
            nodes = nextLevel;
        }
        return result;
    }
}

package S201TO400;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class S467 {
    public boolean isComplete(TreeNode root) {
        // write your code here
        if (root == null)
            return true;
        List<NumberedTreeNode> nextLevel = new ArrayList();
        nextLevel.add(new NumberedTreeNode(root, 1));
        int i = 0;
        while (i < nextLevel.size()) {
            NumberedTreeNode anode = nextLevel.get(i++);
            if (anode.node != null) {
                nextLevel.add(new NumberedTreeNode(anode.node.left, anode.number * 2));
                nextLevel.add(new NumberedTreeNode(anode.node.right, anode.number * 2 + 1));
            }
        }

        return nextLevel.get(i-1).number == nextLevel.size();
    }
}

class NumberedTreeNode{
    TreeNode node;
    int number;
    public NumberedTreeNode(TreeNode node, int number)
    {
        this.node = node;
        this.number = number;
    }
}
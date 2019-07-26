package S1001TO1200;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class S1115 {
    List<Double> results = new ArrayList<>();
    public List<Double> averageOfLevels(TreeNode root) {
        // write your code here
        List<TreeNode> rootLevel = new ArrayList<>();
        rootLevel.add(root);
        calcLevel(rootLevel);
        return results;
    }

    public void calcLevel(List<TreeNode> nodes) {
        List<TreeNode> nextLevel = new ArrayList<>();
        double sum = 0;
        int len = nodes.size();

        for (TreeNode node: nodes
             ) {
            sum += node.val;
            if (node.left != null)
                nextLevel.add(node.left);
            if (node.right != null)
                nextLevel.add(node.right);
        }

        double res = sum / len;
        results.add(res);
        if (nextLevel.size() != 0)
            calcLevel(nextLevel);
    }
}

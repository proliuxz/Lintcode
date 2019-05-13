package S001TO200;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class S164 {
    public List<TreeNode> generateTrees(int n) {
        // write your code here
        return leftToRight(1, n);
    }

    private List<TreeNode> leftToRight(int left, int right)
    {
        List<TreeNode> result = new ArrayList<>();
        if (left>right)
        {
            result.add(null);
            return result;
        }

        for (int i = left; i<=right; i++){
            List<TreeNode> lC = leftToRight(left, i - 1);
            List<TreeNode> rC = leftToRight(i + 1, right);
            for (int j = 0 ; j < lC.size();j++)
            {
                for (int k = 0 ;k < rC.size();k++)
                {
                    TreeNode root = new TreeNode(i);
                    root.left = lC.get(j);
                    root.right = rC.get(k);
                    result.add(root);
                }
            }
        }
        return result;
    }
}

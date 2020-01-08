package S1001TO1200;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class S1188 {
    public int getMinimumDifference(TreeNode root) {
        int res = Integer.MAX_VALUE;
        List<Integer> nums = getPreTraversal(root);
        for (int i = 1; i < nums.size(); i++) {
            int s = nums.get(i) - nums.get(i - 1);
            if (res > s)
                res = s;
        }
        return res;
    }

    private List<Integer> getPreTraversal(TreeNode node)
    {
        List<Integer> res = new ArrayList<>();
        if (node == null)
            return res;
        res.addAll(getPreTraversal(node.left));
        res.add(node.val);
        res.addAll(getPreTraversal(node.right));
        return res;
    }
}

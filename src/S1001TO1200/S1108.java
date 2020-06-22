package S1001TO1200;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S1108 {
    int t;
    Map<String, Integer> trees = new HashMap();
    Map<Integer, Integer> count = new HashMap();
    List<TreeNode> res = new ArrayList();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        t = 1;
        lookup(root);
        return res;
    }

    private int lookup(TreeNode node) {
        if (node == null) return 0;
        String serial = node.val + "," + lookup(node.left) + "," + lookup(node.right);
        int uid = trees.computeIfAbsent(serial, x-> t++);
        count.put(uid, count.getOrDefault(uid, 0) + 1);
        if (count.get(uid) == 2)
            res.add(node);
        return uid;
    }
}

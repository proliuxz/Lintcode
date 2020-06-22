package S601TO800;

import Util.TreeNode;

import java.util.*;

public class S651 {
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;

        Map<Integer, List<Integer>> map = new TreeMap<>();
        Queue<TreeNode> qn = new LinkedList<>();
        Queue<Integer> qv = new LinkedList<>();
        qn.offer(root);
        qv.offer(0);

        while (!qn.isEmpty())
        {
            TreeNode node = qn.poll();
            int val = qv.poll();

            map.putIfAbsent(val, new ArrayList<>());
            map.get(val).add(node.val);

            if (node.left != null) {
                qn.offer(node.left);
                qv.offer(val - 1);
            }
            if (node.right != null) {
                qn.offer(node.right);
                qv.offer(val + 1);
            }
        }
        for(int n : map.keySet()) {
            res.add(map.get(n));
        }
        return res;
    }
}

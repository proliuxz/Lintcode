package S001TO200;

import Util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class S007 {
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty())
        {
            TreeNode cur = queue.poll();
            if (cur == null) {
                sb.append(",#");
            } else {
                sb.append(",").append(String.valueOf(cur.val));
                queue.add(cur.left);
                queue.add(cur.right);
            }
        }
        sb.deleteCharAt(0);
        return sb.toString();
    }

    public TreeNode deserialize(String data) {
        if (data == null || data.length() < 3) {
            return null;
        }

        String[] values = data.split(",");
        TreeNode root = new TreeNode(Integer.valueOf(values[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int index = 1;
        while (!queue.isEmpty()) {
            TreeNode temp = queue.remove();
            if (values[index].equals("#")) {
                temp.left = null;
            } else {
                temp.left = new TreeNode(Integer.valueOf(values[index]));
                queue.add(temp.left);
            }
            index++;
            if (values[index].equals("#")) {
                temp.right = null;
            } else {
                temp.right = new TreeNode(Integer.valueOf(values[index]));
                queue.add(temp.right);
            }
            index++;
        }

        return root;
    }
}

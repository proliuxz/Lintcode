package S801TO1000;

import Util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class S939 {
    public int kthfloorNode(TreeNode root, int k) {
        if(root == null)
            return 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int level = 1;
        while(!q.isEmpty()) {
            int size = q.size();
            if(level == k)
                return size;

            for(int i = 0; i < size; i++) {
                TreeNode cur = q.poll();
                if(cur.left != null)
                    q.offer(cur.left);
                if(cur.right != null)
                    q.offer(cur.right);
            }
            level++;
        }
        return 0;
    }
}

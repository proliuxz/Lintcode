package S801TO1000;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class S878 {
    List<Integer> ans = new ArrayList<>();

    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        if (root == null)
            return ans;
        ans.add(root.val);
        dfs(root.left, true, true);
        dfs(root, false, false);
        dfs(root.right, true, false);
        return ans;
    }

    public void dfs(TreeNode node, boolean isBoundary, boolean isLeft) {
        if (node == null) {
            return;
        }
        if (isBoundary)
        {
            if (node.left == null && node.right == null) {
                return;
            }
            if (isLeft)
            {
                ans.add(node.val);
                if (node.left != null) {
                    dfs(node.left, true, true);
                } else {
                    dfs(node.right, true, true);
                }
            }
            else
            {
                if (node.right != null) {
                    dfs(node.right, true, false);
                } else {
                    dfs(node.left, true, false);
                }
                ans.add(node.val);
            }
        }
        else{
            if (node.left == null && node.right == null) {
                ans.add(node.val);
                return;
            }
            dfs(node.left,false, false);
            dfs(node.right, false, false);
        }
    }
}

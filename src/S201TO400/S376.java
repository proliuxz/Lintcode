package S201TO400;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class S376 {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> binaryTreePathSum(TreeNode root, int target) {
        // write your code here
        if (root == null) {
            return result;
        }

        ArrayList<Integer> buffer = new ArrayList<>();
        buffer.add(root.val);
        findPath(root, target - root.val, buffer);
        return result;
    }

    private void findPath(TreeNode node, int target, List<Integer> buffer)
    {
        if (node.left == null && node.right == null) {
            if (target == 0) {
                result.add(new ArrayList<>(buffer));
            }
            return;
        }

        if (node.left != null)
        {
            buffer.add(node.left.val);
            findPath(node.left, target - node.left.val, buffer);
            buffer.remove(buffer.size() - 1);
        }
        if (node.right != null)
        {
            buffer.add(node.right.val);
            findPath(node.right, target - node.right.val, buffer);
            buffer.remove(buffer.size() - 1);
        }
    }

    public static void main(String[] args)
    {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(4);
        TreeNode t4 = new TreeNode(2);
        TreeNode t5 = new TreeNode(3);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        S376 s = new S376();
        List<List<Integer>> res = s.binaryTreePathSum(t1, 5);
        for (List<Integer> nums: res
             ) {
            for (int num: nums
                 ) {
                System.out.print(num);
                System.out.print(",");
            }
            System.out.println();
        }
    }
}

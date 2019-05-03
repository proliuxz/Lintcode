import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class S480 {
    public List<String> binaryTreePaths(TreeNode root) {
        // write your code here
        if (root==null)
            return new ArrayList<String>();
        else if (root.left==null&&root.right==null)
        {
            List result = new ArrayList<String>();
            result.add(Integer.toString(root.val));
            return result;
        }
        else
            return binaryTreePathsHelper(Integer.toString(root.val),root);
    }

    private List<String> binaryTreePathsHelper(String rootString,TreeNode root)
    {
        List<String> result = new ArrayList<String>();
        if (root.left==null&&root.right==null)
        {
            result.add(rootString);
            return result;
        }
        if (root.left!=null)
            result.addAll(binaryTreePathsHelper(rootString+"->"+root.left.val , root.left));
        if (root.right!=null)
            result.addAll(binaryTreePathsHelper(rootString+"->"+root.right.val , root.right));
        return result;
    }
}

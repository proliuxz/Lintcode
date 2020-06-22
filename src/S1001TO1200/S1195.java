package S1001TO1200;

import Util.TreeNode;

import java.util.*;

public class S1195 {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root==null)
            return result;
        helper(root,0,result);
        return result;
    }

    public void helper(TreeNode root, int level, List<Integer> result) {
        if(root==null)
            return;
        if(result.size()==level)
            result.add(root.val);
        else
            result.set(level, Math.max(root.val, result.get(level)));
        helper(root.left, level+1, result);
        helper(root.right, level+1, result);
    }
}

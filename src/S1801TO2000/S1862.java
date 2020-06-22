package S1801TO2000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TreeNode
{
    public TreeNode(int value)
    {
        val = value;
        children = new ArrayList<>();
    }
    public int val;
    public List<TreeNode> children;
    public void AddChild(TreeNode node)
    {
        children.add(node);
    }
    public int getMaxVal(){
        int r = 0;
        for (TreeNode child: children
             ) {
            r = Math.max(child.getMaxVal(), r);
        }
        return r + val;
    }
}
public class S1862 {
    public int timeToFlowerTree(int[] father, int[] time) {
        TreeNode root = new TreeNode(0);
        List<TreeNode> list= new ArrayList<>();
        Map<Integer, Integer> index = new HashMap<>();
        list.add(root);
        for (int i = 1; i < father.length; i++) {
            list.add(new TreeNode(time[i]));
            index.put(i, father[i]);
        }
        for (int i = 1; i < father.length; i++) {
            TreeNode node = list.get(i);
            int f = index.get(i);
            list.get(f).AddChild(node);
        }
        return root.getMaxVal();
    }
}

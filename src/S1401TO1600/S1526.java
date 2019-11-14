package S1401TO1600;

import Util.UndirectedGraphNode;

import java.util.ArrayList;
import java.util.List;

public class S1526 {
    public List<Integer> preorder(UndirectedGraphNode root) {
        // write your code here
        List<Integer> res = new ArrayList<>();
        if (root == null)
            return res;
        res.add(root.label);
        for (UndirectedGraphNode node : root.neighbors
             ) {
            res.addAll(preorder(node));
        }
        return res;
    }
}

package S1401TO1600;

import Util.UndirectedGraphNode;

import java.util.ArrayList;
import java.util.List;

public class S1525 {
    public List<Integer> postorder(UndirectedGraphNode root) {
        // write your code here
        List<Integer> res = new ArrayList<>();
        if (root == null)
            return res;

        for (UndirectedGraphNode node : root.neighbors
        ) {
            res.addAll(postorder(node));
        }
        res.add(root.label);
        return res;
    }
}

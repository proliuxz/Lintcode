package S1401TO1600;

import Util.DirectedGraphNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class S1533 {
    public List<List<Integer>> levelOrder(ArrayList<DirectedGraphNode> nodes) {
        LinkedList<List<Integer>> res = new LinkedList<>();
        Queue<Integer> q = new LinkedList<>();
        if(nodes.size() == 0)
            return res;
        q.add(1);

        while(q.size() > 0) {
            int sz = q.size();
            LinkedList<Integer> cur = new LinkedList<Integer>();
            while(sz > 0) {
                int tmp = q.peek().intValue();
                cur.add(q.poll());
                for(int i = 0;i < nodes.get(tmp - 1).neighbors.size();i++) {
                    q.add(Integer.valueOf(nodes.get(tmp-1).neighbors.get(i).label));
                }
                sz--;
            }
            res.add(cur);
        }
        return res;
    }
}

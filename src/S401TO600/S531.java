package S401TO600;

import Util.UndirectedGraphNode;

import java.util.*;

public class S531 {
    public int sixDegrees(List<UndirectedGraphNode> graph, UndirectedGraphNode s, UndirectedGraphNode t) {
        // write your code here
        if (s.label == t.label)
            return 0;
        Queue<UndirectedGraphNode> queue = new LinkedList<>();
        Map<Integer, Integer> visited = new HashMap<>();

        queue.offer(s);
        visited.put(s.label, 0);
        while (!queue.isEmpty()) {
            UndirectedGraphNode node = queue.poll();
            int step = visited.get(node.label);
            for (int i = 0; i < node.neighbors.size(); i++) {
                if (visited.containsKey(node.neighbors.get(i).label)) {
                    continue;
                }
                visited.put(node.neighbors.get(i).label, step + 1);
                queue.offer(node.neighbors.get(i));
                if (node.neighbors.get(i).label == t.label) {
                    return step + 1;
                }
            }
        }

        return -1;
    }
}

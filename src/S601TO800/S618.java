package S601TO800;

import Util.UndirectedGraphNode;

import java.util.*;

public class S618 {
    public UndirectedGraphNode searchNode(ArrayList<UndirectedGraphNode> graph,
                                          Map<UndirectedGraphNode, Integer> values,
                                          UndirectedGraphNode node,
                                          int target) {
        Queue<UndirectedGraphNode> queue = new LinkedList<>();
        Set<UndirectedGraphNode> visited = new HashSet<>();

        queue.offer(node);
        visited.add(node);

        while (!queue.isEmpty()) {
            UndirectedGraphNode head = queue.poll();
            if (values.get(head) == target)
                return head;

            head.neighbors.stream().filter(n -> !visited.contains(n)).forEach(n -> {
                queue.offer(n);
                visited.add(n);
            });
        }
        return null;
    }
}

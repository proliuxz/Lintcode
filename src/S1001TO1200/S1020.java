package S1001TO1200;

import java.util.ArrayList;
import java.util.List;

public class S1020 {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        path.add(0);
        dfs(graph, 0, res, path);
        return res;
    }

    private void dfs(int[][] graph, int node, List<List<Integer>> res, List<Integer> path) {
        if (node == graph.length - 1) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int nextNode : graph[node]) {
            path.add(nextNode);
            dfs(graph, nextNode, res, path);
            path.remove(path.size() - 1);
        }
    }
}

package S1001TO1200;

public class S1031 {
    int[][] g;
    int[] nodes;
    public boolean isBipartite(int[][] graph) {
        // Write your code here
        g = graph;
        nodes = new int[graph.length];
        for (int i = 0; i < nodes.length ; i++)
            if (nodes[i] == 0 && !dfs(i, 1))
                return false;
        return true;
    }
    private boolean dfs (int v, int c)
    {
        nodes[v] = c;
        for (int i = 0; i < g[v].length; ++i)
            if (nodes[g[v][i]] == c || (nodes[g[v][i]] == 0 && !dfs(g[v][i], -c)))
                return false;
        return true;
    }
}

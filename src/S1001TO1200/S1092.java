package S1001TO1200;

import java.util.*;

public class S1092 {
    int[] dirs = {0,1,0,-1,0};
    List<List<Integer>> forest;
    int h = 0;
    int w = 0;

    public int cutOffTree(List<List<Integer>> forest) {
        if (forest == null || forest.size() == 0)
            return 0;
        this.forest = forest;
        h = forest.size();
        w = forest.get(0).size();

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[2]));

        for (int i = 0; i < h; i++)
            for (int j = 0; j < w; j++)
                if (forest.get(i).get(j) > 1)
                    pq.add(new int[] {i, j, forest.get(i).get(j)});

        int[] start = new int[2];
        int sum = 0;
        while (!pq.isEmpty()) {
            int[] tree = pq.poll();
            int step = bfs(start, tree);

            if (step < 0) return -1;
            sum += step;

            start[0] = tree[0];
            start[1] = tree[1];
        }

        return sum;
    }

    private int bfs(int[] start, int[] tree) {
        int step = 0;
        boolean[][] visited = new boolean[h][w];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(start);
        visited[start[0]][start[1]] = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] curr = queue.poll();
                if (curr[0] == tree[0] && curr[1] == tree[1])
                    return step;

                for (int j = 0; j < 4; j++) {
                    int nr = curr[0] + dirs[j];
                    int nc = curr[1] + dirs[j + 1];
                    if (nr < 0 || nr >= h || nc < 0 || nc >= w || forest.get(nr).get(nc) == 0 || visited[nr][nc])
                        continue;
                    queue.add(new int[] {nr, nc});
                    visited[nr][nc] = true;
                }
            }
            step++;
        }
        return -1;
    }
}

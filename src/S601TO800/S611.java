package S601TO800;

import Util.Point;

import java.util.LinkedList;
import java.util.Queue;

public class S611 {
    public int shortestPath(boolean[][] grid, Point source, Point destination) {
        if (grid == null || grid.length == 0 || grid[0].length == 0)
            return -1;
        Queue<Point> queue = new LinkedList<>();
        int[][] dirs = {{1, 2}, {1, -2}, {-1, 2}, {-1, -2}, {2, 1}, {2, -1}, {-2, 1}, {-2, -1}};
        boolean[][] visited = new boolean[grid.length][grid[0].length];

        queue.offer(source);
        visited[source.x][source.y] = true;

        if (source.x == destination.x && source.y == destination.y)
            return 0;

        int dist = 0;
        while (!queue.isEmpty()) {
            dist++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Point cur = queue.poll();
                for (int[] dir : dirs) {
                    int x = cur.x + dir[0];
                    int y = cur.y + dir[1];
                    if (x >= 0 && x < grid.length && y >= 0 && y < grid[0].length && !grid[x][y] && !visited[x][y]) {
                        if (x == destination.x && y == destination.y)
                            return dist;
                        queue.offer(new Point(x, y));
                        visited[x][y] = true;
                    }
                }
            }

        }
        return -1;
    }
}

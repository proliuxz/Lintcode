package S601TO800;

import java.util.LinkedList;
import java.util.Queue;

public class S787 {
    int grid[][];
    boolean[][] visited;
    int h;
    int w;
    int[][] dirs = new int[][] {{0,1},{0,-1},{1,0},{-1,0}};
    public boolean hasPath(int[][] maze, int[] start, int[] destination) {
        h = maze.length;
        w = maze[0].length;
        visited = new boolean[h][w];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(start);
        visited[start[0]][start[1]] = true;
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            if (cur[0] == destination[0] && cur[1] == destination[1]) {
                return true;
            }
            for (int[] dir : dirs) {
                int nx = cur[0], ny = cur[1];
                while (nx >= 0 && nx < h && ny >= 0 && ny < w && maze[nx][ny] == 0) {
                    nx += dir[0];
                    ny += dir[1];
                }
                nx -= dir[0];
                ny -= dir[1];
                if (!visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.offer(new int[]{nx, ny});
                }
            }
        }
        return false;
    }
}

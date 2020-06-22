package S601TO800;

import java.util.LinkedList;
import java.util.Queue;

public class S750 {
    public int Portal(char[][] Maze) {
        int[][] dirs = new int[][] {{0,1}, {0,-1}, {1,0},{-1,0}};
        int h = Maze.length;
        int w = Maze[0].length;
        boolean[] visited = new boolean[h * w];
        int res = 0;

        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (Maze[i][j] == 'S') {
                    queue.offer(new int[]{i, j});
                    visited[i * w + j] = true;
                }
            }
        }
        queue.add(null);

        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            if (cur == null)
            {
                res++;
                if (!queue.isEmpty())
                    queue.add(null);
                continue;
            }
            if (Maze[cur[0]][cur[1]] == 'E') {
                return res;
            }
            for (int[] dir : dirs) {
                int x = cur[0] + dir[0];
                int y = cur[1] + dir[1];
                if (x>=0 && y>=0 && x<h && y<w && Maze[x][y] != '#' && !visited[x * w + y]) {
                    queue.offer(new int[] {x, y});
                    visited[x * w + y] = true;
                }
            }
        }
        return -1;
    }
}

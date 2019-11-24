package S401TO600;

import java.util.LinkedList;
import java.util.Queue;

public class S433
{
    public int numIslands(boolean[][] grid) {
        // write your code here
        if (grid == null || grid.length == 0 || grid[0].length == 0)
            return 0;
        
        int res = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j <grid[0].length; j++) {
                if (grid[i][j] && !visited[i][j])
                {
                    res++;
                    bfs(grid, visited, i, j);
                }
            }
        }
        return res;
    }

    private void bfs(boolean[][] grid, boolean[][] visited, int x, int y)
    {
        int[][] dirs = new int[][] {{0,-1},{0,1},{1,0},{-1,0}};

        Queue<Integer> qx = new LinkedList<>();
        Queue<Integer> qy = new LinkedList<>();

        qx.offer(x);
        qy.offer(y);
        visited[x][y] = true;

        while (!qx.isEmpty()) {
            int cx = qx.poll();
            int cy = qy.poll();

            for (int[] dir: dirs
                 ) {
                int nx = cx + dir[0];
                int ny = cy + dir[1];
                if (0 <= nx && nx < grid.length &&
                        0 <= ny && ny < grid[0].length &&
                        !visited[nx][ny] && grid[nx][ny]) {
                    qx.offer(nx);
                    qy.offer(ny);
                    visited[nx][ny] = true;
                }
            }
        }
    }
}

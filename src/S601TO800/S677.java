package S601TO800;

import java.util.LinkedList;
import java.util.Queue;

public class S677 {
    int h = 0;
    int w = 0;
    public int numsofIsland(boolean[][] grid, int k) {
        int res = 0;

        if (grid == null || grid.length == 0)
            return res;
        h = grid.length;
        if (grid[0].length == 0)
            return res;

        w = grid[0].length;
        for (int i = 0; i < h; i++)
            for (int j = 0; j < w; j++)
                if (grid[i][j])
                    if (findIsland(grid, i, j) >= k)
                        res++;
        return res;
    }

    private int findIsland(boolean[][] grid, int x, int y) {
        int[][] dirs = new int[][] {{0,-1},{0,1},{-1,0},{1,0}};
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        grid[x][y] = false;
        int count = 0;

        while (! queue.isEmpty()) {
            int[] cur = queue.poll();
            count++;

            for (int[] dir : dirs) {
                int nx = cur[0] + dir[0];
                int ny = cur[1] + dir[1];

                if (nx < 0 || nx >= h || ny < 0 || ny >= w || grid[nx][ny] == false)
                    continue;

                queue.add(new int[] {nx, ny});
                grid[nx][ny] = false;
            }
        }
        return count;
    }
}

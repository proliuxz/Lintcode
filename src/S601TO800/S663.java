package S601TO800;

import java.util.LinkedList;
import java.util.Queue;

public class S663 {

    public void wallsAndGates(int[][] rooms) {
        int h = rooms.length;
        if (h == 0)
            return;
        int w = rooms[0].length;
        int[][] dirs = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < h; i++)
            for (int j = 0; j < w; j++)
                if (rooms[i][j] == 0)
                    q.offer(new int[]{i, j});

        while (!q.isEmpty()) {
            int[] pos = q.poll();
            for (int[] dir : dirs) {
                int x = pos[0] + dir[0];
                int y = pos[1] + dir[1];
                if (0 <= x && x < h && 0 <= y && y < w && rooms[x][y] == Integer.MAX_VALUE) {
                    q.offer(new int[]{x, y});
                    rooms[x][y] = rooms[pos[0]][pos[1]] + 1;
                }
            }
        }
    }
}

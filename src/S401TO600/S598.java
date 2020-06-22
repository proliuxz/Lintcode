package S401TO600;

import java.util.LinkedList;
import java.util.Queue;

class Point{
    int x;
    int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class S598 {
    public int zombie(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0] == null || grid[0].length == 0)
            return 0;

        int[][] dirs = new int[][] {{0,1}, {0,-1}, {1,0}, {-1,0}};
        int people = 0;

        Queue<Point> queue = new LinkedList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0)
                    people++;
                else if (grid[i][j] == 1)
                    queue.offer(new Point(i, j));
            }
        }

        if (people == 0)
            return 0;

        int step = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Point pt = queue.poll();
                for (int[] dir: dirs) {
                    Point next = new Point(pt.x + dir[0], pt.y + dir[1]);
                    if (isValid(grid, next) && grid[next.x][next.y] == 0) {
                        grid[next.x][next.y] = 1;
                        people--;
                        queue.offer(next);
                    }
                }
            }
            step++;
            if (people == 0) {
                return step;
            }
        }

        return -1;
    }

    private boolean isValid(int[][] grid, Point pt) {
        return pt.x >= 0 && pt.x < grid.length
                && pt.y >= 0 && pt.y < grid[0].length
                && grid[pt.x][pt.y] != 2;
    }
}

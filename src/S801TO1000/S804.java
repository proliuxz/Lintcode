package S801TO1000;

import java.util.*;

import Util.Point;

public class S804 {
    int h = 0;
    int w = 0;
    int[][] grid;

    public int numDistinctIslands2(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0)
            return 0;

        Set<String> set = new HashSet<>();

        h = grid.length;
        w = grid[0].length;
        this.grid = grid;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (grid[i][j] == 1) {
                    List<Point> island = new ArrayList<>();
                    dfs(i, j, island);
                    set.add(getUniq(island));
                }
            }
        }
        return set.size();
    }

    private void dfs(int x, int y, List<Point> island) {
        island.add(new Point(x, y));
        grid[x][y] = 0;
        int[] dirs = new int[]{1, 0, -1, 0, 1};
        for (int i = 0; i < 4; i++) {
            int nx = x + dirs[i];
            int ny = y + dirs[i + 1];
            if (nx >= 0 && nx < h && ny >= 0 && ny < w && grid[nx][ny] == 1)
                dfs(nx, ny, island);
        }
    }

    private String getUniq(List<Point> points) {
        List<String> islands = new ArrayList<>();
        int[] trans = new int[]{1, -1, -1, 1, 1};
        for (int i = 0; i < 4; i++) {
            List<Point> list1 = new ArrayList<>();
            List<Point> list2 = new ArrayList<>();
            for (Point p : points) {
                list1.add(new Point(trans[i] * p.x, trans[i + 1] * p.y));
                list2.add(new Point(trans[i] * p.y, trans[i + 1] * p.x));
            }
            islands.add(stringify(list1));
            islands.add(stringify(list2));
        }
        Collections.sort(islands);
        return islands.get(0);
    }

    private String stringify(List<Point> points) {
        Collections.sort(points, (p1, p2) -> p1.x == p2.x ? p1.y - p2.y : p1.x - p2.x);
        StringBuilder sb = new StringBuilder();
        Point s = points.get(0);
        for (Point p : points) {
            sb.append(p.x - s.x);
            sb.append(",");
            sb.append(p.y - s.y);
            sb.append(";");
        }
        return sb.toString();
    }
}

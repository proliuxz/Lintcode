package S601TO800;

import java.util.ArrayList;
import java.util.List;

public class S778 {
    int[][] grid;
    boolean[][] toP;
    boolean[][] toA;
    int h;
    int w;
    int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        List<List<Integer>> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0)
            return res;

        grid = matrix;
        h = matrix.length;
        w = matrix[0].length;

        toP = new boolean[h][w];
        toA = new boolean[h][w];

        for (int x = 0; x < h; x++) {
            helper(x, 0, Integer.MIN_VALUE, new boolean[h][w], toP);
            helper(x, w - 1, -Integer.MIN_VALUE, new boolean[h][w], toA);
        }

        for (int y = 0; y < w; y++) {
            helper(0, y, Integer.MIN_VALUE, new boolean[h][w], toP);
            helper(h - 1, y, Integer.MIN_VALUE, new boolean[h][w], toA);
        }

        for (int i = 0; i < h; i++)
            for (int j = 0; j < w; j++)
                if (toP[i][j] && toA[i][j]) {
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    res.add(list);
                }

        return res;
    }

    private void helper(int x, int y, int curHeight, boolean[][] visited, boolean[][] toX) {
        if (x < 0 || x >= h || y < 0 || y >= w || grid[x][y] < curHeight || visited[x][y] || toX[x][y])
            return;
        visited[x][y] = true;
        toX[x][y] = true;

        for (int[] dir : dirs) {
            int newX = x + dir[0];
            int newY = y + dir[1];
            helper(newX, newY, grid[x][y], visited, toX);
        }
    }
}

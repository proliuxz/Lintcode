package S1401TO1600;

import S001TO200.S147;

public class S1479 {
    int[][] grid;
    boolean[][] visited;
    int[][] dirs = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
    public boolean reachEndpoint(int[][] map) {
        // Write your code here
        grid = map;
        visited = new boolean[map.length][map[0].length];
        visited[0][0] = true;
        return reachEndpoint(0, 0);
    }

    public boolean reachEndpoint(int x, int y)
    {
        if (grid[x][y] == 9)
            return true;
        if (grid[x][y] == 0)
            return false;
        boolean res = false;
        for (int[] dir: dirs
        ) {
            int x2 = x + dir[0];
            int y2 = y + dir[1];
            if (x2 >= 0 && x2 < grid.length && y2 >= 0 && y2 < grid[0].length && visited[x2][y2] == false)
            {
                visited[x2][y2] = true;
                res = res || reachEndpoint(x2, y2);
                visited[x2][y2] = false;
            }
        }
        return res;
    }

    public static void main(String[] args)
    {
        S1479 s = new S1479();
        int[][] grid = {{1,1,1,1,0,1},{0,1,0,0,0,0},{1,0,0,0,1,0},{0,0,1,1,1,0},{1,1,0,0,0,0},{1,9,1,1,0,0}};
        s.reachEndpoint(grid);
    }
}

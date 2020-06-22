package S1801TO2000;

public class S1896 {
    int[][] grid;
    boolean[][] visited;
    int res = 0;
    int h;
    int w;
    public int PickCarrots(int[][] carrot) {
        grid = carrot;
        h = carrot.length;
        w = carrot[0].length;
        visited = new boolean[h][w];
        dfs((h - 1) >> 1, (w - 1) >> 1);
        return res;
    }

    private void dfs(int x, int y)
    {
        res += grid[x][y];
        visited[x][y] = true;
        int x2 = x, y2 = y;
        int carrot = -1;
        int[] dirs = new int[]{0,1,0,-1,0};
        for (int i = 0; i < 4; i++) {
            int tx = x+dirs[i];
            int ty = y+dirs[i + 1];
            if (tx >= 0 && tx < h && ty >=0 && ty < w && visited[tx][ty] == false && grid[tx][ty] > carrot)
            {
                carrot = grid[tx][ty];
                x2 = tx;
                y2 = ty;
            }
        }
        if (carrot == -1)
            return;
        dfs(x2, y2);
    }
}

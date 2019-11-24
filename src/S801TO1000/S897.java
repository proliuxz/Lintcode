package S801TO1000;

public class S897 {
    int [][] dir = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int dfs(boolean [][] visit, int [][] grid, int x, int y, int n, int m)
    {
        visit[x][y] = true;
        int ans = 0;
        if(grid[x][y] == 2)
            ans++;
        for(int i = 0; i < 4; i++) {
            int dx = x + dir[i][0];
            int dy = y + dir[i][1];
            if(dx >= n || dx < 0 || dy >= m || dy < 0 || visit[dx][dy] || grid[dx][dy] == 0)
                continue;
            ans += dfs(visit, grid, dx, dy, n, m);
        }
        if(ans != 0)
            return 1;
        else
            return 0;
    }

    public int numIslandCities(int [][] grid) {
        // Write your code here
        int n = grid.length;
        int m = grid[0].length;
        boolean [][] visit = new boolean[n][m];
        int ans = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(visit[i][j] == false && grid[i][j] != 0) {
                    ans += dfs(visit, grid, i, j, n, m);
                }
            }
        }
        return ans;
    }
}

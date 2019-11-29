package S1201TO1400;

public class S1386 {
    int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1},{1,1},{1,-1},{-1,1},{-1,-1}};
    int[][] grid;
    int h = 0;
    int w = 0;

    public int dfs(int x, int y){
        int res = 0;
        for (int[] dir: dirs) {
            int tx = x + dir[0];
            int ty = y + dir[1];
            if(tx < 0 || tx >= h || ty < 0 || ty >= w || grid[tx][ty] <= grid[x][y])
                continue;
            res = Math.max(res, dfs(tx, ty));
        }
        return res + 1;
    }

    public int cableCarRide(int[][] height) {
        // Write your code here
        grid = height;
        h = height.length;
        w = height[0].length;
        int res = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                res = Math.max(res, dfs(i, j));
            }
        }
        return res;
    }
}

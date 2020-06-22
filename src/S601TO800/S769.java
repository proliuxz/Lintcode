package S601TO800;

public class S769 {
    public int[][] spiralArray(int n) {
        int[][] res = new int[n][n];
        int[] dirs = new int[]{0, 1, 0, -1, 0};
        int dir = 0;
        int x = 0;
        int y = 0;
        for (int i = 1; i <= n * n; i++) {
            res[x][y] = i;
            int nx = x + dirs[dir];
            int ny = y + dirs[dir + 1];
            if (nx < 0 || nx >= n || ny < 0 || ny >= n || res[nx][ny] != 0) {
                dir = (dir + 1) % 4;
                nx = x + dirs[dir];
                ny = y + dirs[dir + 1];
            }
            x = nx;
            y = ny;
        }
        return res;
    }
}

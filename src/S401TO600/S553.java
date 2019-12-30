package S401TO600;

public class S553 {
    public int maxKilledEnemies(char[][] grid) {
        // write your code here
        if (grid == null || grid.length == 0)
            return 0;
        int res = 0;
        int row = 0;
        int h = grid.length;
        int w = grid[0].length;
        int[] cols = new int[w];
        for (int i = 0; i < h; i++)
            for (int j = 0; j < w; j++) {
                if (j == 0 || grid[i][j-1] == 'W') {
                    row = 0;
                    for (int k = j; k < w && grid[i][k] != 'W'; ++k)
                        if (grid[i][k] == 'E')
                            row += 1;
                }
                if (i == 0 || grid[i-1][j] == 'W') {
                    cols[j] = 0;
                    for (int k = i; k < h && grid[k][j] != 'W'; ++k)
                        if (grid[k][j] == 'E')
                            cols[j] += 1;
                }

                if (grid[i][j] == '0' && row + cols[j] > res)
                    res = row + cols[j];
            }
        return res;
    }
}

package S1401TO1600;

public class S1590 {
    public int surfaceAreaof3DShapes(int[][] grid) {
        // Write your code here.
        int length = grid.length;
        int surface1 = 0;
        int surface2 = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (grid[i][j] != 0) {
                    surface1 += grid[i][j] * 4 + 2;
                }
                if (i != length - 1) {
                    surface2 += (grid[i][j] > grid[i + 1][j] ? grid[i + 1][j] : grid[i][j]) * 2;
                    surface2 += (grid[j][i] > grid[j][i + 1] ? grid[j][i + 1] : grid[j][i]) * 2;
                }
            }
        }
        return surface1 - surface2;
    }
}

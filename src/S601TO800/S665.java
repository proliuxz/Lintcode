package S601TO800;

public class S665 {
    int[][] grid;

    public S665(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return;

        int h = matrix.length;
        int w = matrix[0].length;
        grid = new int[h + 1][w + 1];
        for (int i = 0; i < h; i++)
            for (int j = 0; j < w; j++)
                grid[i + 1][j + 1] = grid[i + 1][j] + grid[i][j + 1] + matrix[i][j] - grid[i][j];
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return grid[row2 + 1][col2 + 1] - grid[row1][col2 + 1] - grid[row2 + 1][col1] + grid[row1][col1];
    }
}

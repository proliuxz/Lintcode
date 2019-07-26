package S1001TO1200;

public class S1010 {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        // Write your code here
        if (grid == null || grid.length == 0 || grid[0].length == 0)
            return 0;

        int h = grid.length;
        int w = grid[0].length;
        int[] maxH = new int[h];
        int[] maxW = new int[w];
        for (int i = 0; i <h ; i++) {
            for (int j = 0; j <w ; j++) {
                if (grid[i][j] > maxH[i])
                    maxH[i] = grid[i][j];
                if (grid[i][j] > maxW[j])
                    maxW[j] = grid[i][j];
            }
        }
        int result = 0;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                result += Math.min(maxH[i], maxW[j]) - grid[i][j];
            }
        }
        return result;
    }
}

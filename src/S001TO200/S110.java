package S001TO200;

public class S110 {
    public int minPathSum(int[][] grid) {
        // write your code here
        if (grid == null || grid.length == 0 || grid[0].length == 0)
            return 0;
        int h = grid.length;
        int w = grid[0].length;
        for (int i = 1; i < h ; i++)
            grid[i][0] = grid[i-1][0] + grid[i][0];
        for (int i = 1; i < w ; i++)
            grid[0][i] = grid[0][i-1] + grid[0][i];
        for (int i = 1; i < h; i++) {
            for (int j = 1; j < w; j++) {
                grid[i][j] = Math.min(grid[i-1][j], grid[i][j-1]) + grid[i][j];
            }
        }
        return grid[h-1][w-1];
    }

    public static void main(String[] args)
    {
        S110 s = new S110();
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        int r = s.minPathSum(grid);
        System.out.println(r);
    }
}

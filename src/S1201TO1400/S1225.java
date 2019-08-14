package S1201TO1400;

public class S1225 {
    int[][] paths = new int[][] { {0, 1}, {0, -1}, {1, 0}, {-1, 0} };

    private boolean valid(int x, int y, int[][] grid) {
        if (0 <= x && x < grid.length && 0 <= y && y < grid[x].length) {
            return grid[x][y] == 0;
        }
        return true;
    }

    public int islandPerimeter(int[][] grid) {
        // Write your code here
        int Perimeter = 0;

        for(int i = 0; i < grid.length; i ++) {
            for(int j = 0; j < grid[i].length;j ++) {
                if(grid[i][j] == 1) {
                    for (int[] path: paths
                         ) {
                        if (valid(i + path[0], j + path[1], grid)) {
                            Perimeter ++;
                        }
                    }
                }
            }
        }
        return Perimeter;
    }
}

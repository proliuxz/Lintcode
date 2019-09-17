package S201TO400;

public class S278 {
    public boolean helper(int[][] screen, int x, int y, int newColor) {
        if (screen[x][y] == newColor) return false;
        return helper(screen, x, y, screen[x][y], newColor);
    }

    public boolean helper(int[][] screen, int x, int y, int oc, int nc){
        int[][] dirs = new int[][] {{1,0},{-1,0},{0,1},{0,-1}};
        if (x < 0 || x >= screen.length || y < 0 || y >= screen[0].length)
            return false;
        if (screen[x][y] == oc) {
            screen[x][y] = nc;
            for (int[] dir: dirs
                 ) {
                helper(screen, x + dir[0] , y + dir[1], oc, nc);
            }
        }
        return true;
    }
}

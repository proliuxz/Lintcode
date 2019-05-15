package S201TO400;

public class S381 {
    public int[][] generateMatrix(int n) {
        // write your code here
        int[][] result = new int[n][n];
        if (n == 0)
            return result;
        int[][] dirs = new int[][] { {0,1}, {1,0}, {0,-1}, {-1,0}};
        int len = n * n;
        int x = 0;
        int y = -1;
        int dir = 0;
        int size = n;
        for (int i = 1; i <= len;) {
            for (int j = 0; j < size ; j++) {
                x += dirs[dir][0];
                y += dirs[dir][1];
                result[x][y] = i;
                i++;
            }
            if(dir == 0 || dir == 2)
                size--;
            if (++dir == 4)
                dir = 0;
        }
        return result;
    }
}

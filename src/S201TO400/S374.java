package S201TO400;

import java.util.ArrayList;
import java.util.List;

public class S374 {
    public List<Integer> spiralOrder(int[][] matrix) {
        // write your code here
        List<Integer> result = new ArrayList<Integer>();
        if (matrix == null || matrix.length == 0 || matrix[0].length==0)
            return result;
        int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};
        int row = matrix.length;
        int col = matrix[0].length;
        boolean[][] visited = new boolean[row][col];
        int r = 0;
        int c = 0;
        int di = 0;
        for (int i = 0; i < row * col; i++) {
            result.add(matrix[r][c]);
            visited[r][c] = true;
            int cr = r + dirs[di][0];
            int cc = c + dirs[di][1];
            if (0 <= cr && cr < row && 0 <= cc && cc < col && !visited[cr][cc]){
                r = cr;
                c = cc;
            } else {
                di = (di + 1) % 4;
                r += dirs[di][0];
                c += dirs[di][1];
            }
        }
        return result;
    }
}
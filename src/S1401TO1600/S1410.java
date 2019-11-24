package S1401TO1600;

import java.util.LinkedList;
import java.util.Queue;

public class S1410 {
    public String waterInjection(int[][] matrix, int R, int C) {
        // Write your code here
        int dirs[][] = {{1,0},{-1,0},{0,1},{0,-1}};
        int[][] visited = new int[matrix.length][matrix[0].length];
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{R, C});
        visited[R][C]=1;

        while(!q.isEmpty()) {
            int[] x = q.poll();
            if(x[0] == 0 || x[0] == matrix.length - 1 ||
                    x[1] == 0 || x[1] == matrix[0].length - 1)
                return "YES";

            int num = matrix[x[0]][x[1]];

            for(int i = 0; i < 4; i++) {
                int tx = x[0] + dirs[i][0];
                int ty = x[1] + dirs[i][1];

                if(tx < 0 || tx >= matrix.length || ty < 0 || ty >= matrix[0].length) {
                    continue;
                }

                if(matrix[tx][ty] < num && visited[tx][ty] == 0) {
                    q.offer(new int[] {tx, ty});
                    visited[tx][ty] = 1;
                }
            }
        }
        return "NO";
    }
}

package S1001TO1200;

public class S1102 {
    public int[][] imageSmoother(int[][] M) {
        if (M == null || M.length == 0 || M[0].length == 0)
            return null;
        int r = M.length;
        int c = M[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = helper(M, i, j);
            }
        }
        return res;
    }

    private int helper(int[][] M, int x, int y) {
        int r = M.length;
        int c = M[0].length;
        int sum = 0;
        int count = 0;
        int[][] dirs = {
                { -1, -1 }, { -1, 0 }, { -1, 1 },
                { 0, -1 }, { 0, 0 }, { 0, 1 },
                { 1, -1 }, { 1, 0 }, { 1, 1 },
        };

        for (int[] dir: dirs
             ) {
            if (x + dir[0] < 0 || x + dir[0] >= r || y + dir[1] < 0 || y + dir[1] >= c) {
                continue;
            }
            count++;
            sum += M[x + dir[0]][y + dir[1]];
        }

        return sum / count;
    }
}

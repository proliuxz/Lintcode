package S1401TO1600;

public class S1599 {
    public int projectionArea(int[][] grid) {
        // write your code here
        if (grid == null || grid.length == 0 || grid[0].length == 0)
            return 0;
        int len = grid.length;
        int[] w = new int[len];
        int[] h = new int[len];
        int p = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                int val = grid[i][j];
                if (val > h[i])
                    h[i] = val;
                if (val > w[j])
                    w[j] = val;
                if (val > 0)
                    p++;
            }
        }
        int res = p;
        for (int wv: w)
            res += wv;

        for (int hv: h)
            res += hv;
        return res;
    }
}

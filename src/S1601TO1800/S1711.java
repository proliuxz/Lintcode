package S1601TO1800;

public class S1711 {
    public int minFallingPathSum(int[][] A) {
        for (int i = 1; i < A.length; i++) {
            for (int j = 0; j < A.length; ++j) {
                int t = A[i - 1][j];
                t = Math.min(t, A[i - 1][Math.max(j - 1, 0)]);
                t = Math.min(t, A[i - 1][Math.min(j + 1, A.length - 1)]);
                A[i][j] += t;
            }
        }

        int res = A[A.length - 1][0];
        for (int j = 1; j < A.length; j++)
            res = Math.min(res, A[A.length - 1][j]);
        return res;
    }
}

package S1401TO1600;

public class S1501 {
    public int[][] transpose(int[][] A) {
        // write your code here
        int r = A.length;
        int c = A[0].length;
        int[][] res = new int[c][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[j][i] = A[i][j];
            }
        }
        return res;
    }
}

package S1401TO1600;

public class S1436 {
    public int[][] flipAndInvertImage(int[][] A) {
        // Write your code here
        if (A == null || A.length == 0 || A[0].length == 0)
            return null;
        int h = A.length;
        int w = A[0].length;
        int res[][] = new int[h][w];
        for (int i = 0; i < h; i++) {
            res[i] = flipAndInvert(A[i]);
        }
        return res;
    }

    private int[] flipAndInvert(int[] row)
    {
        int len = row.length;
        for (int i = 0; i < (len + 1) >> 1 ; i++) {
            int tmp = flip(row[i]);
            row[i] = flip(row[len - i - 1]);
            row[len - i - 1] = tmp;
        }
        return row;
    }

    private int flip(int p)
    {
        return p == 0 ? 1 : 0;
    }
}

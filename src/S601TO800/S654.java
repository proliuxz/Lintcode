package S601TO800;

public class S654 {
    public int[][] multiply(int[][] A, int[][] B) {
        int ha = A.length;
        int wa = A[0].length;
        int wb = B[0].length;

        int[][] res = new int[ha][wb];

        for (int i = 0; i < ha; ++i)
            for (int j = 0; j < wa; ++j)
                if (A[i][j] != 0)
                    for (int l = 0; l < wb; ++l)
                        if (B[j][l] != 0)
                            res[i][l] += A[i][j] * B[j][l];
        return res;
    }
}

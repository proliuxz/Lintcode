package S601TO800;

public class S770 {
    public int[] maxAndMin(int[][] matrix) {
        // write your code here
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return new int[0];
        int[] res = new int[2];
        res[0] = Integer.MIN_VALUE;
        res[1] = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int val = matrix[i][j];
                if (val > res[0])
                    res[0] = val;
                if (val < res[1])
                    res[1] = val;
            }
        }
        return res;
    }
}

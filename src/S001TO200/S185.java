package S001TO200;

public class S185 {
    public int[] printZMatrix(int[][] matrix) {
        // write your code here
        if (matrix == null || matrix.length == 0)
            return null;

        int h = matrix.length;
        int w = matrix[0].length;
        int[] result = new int[h * w];
        int index = 0;

        for (int i = 0; i < h + w - 1; i++) {
            if (i % 2 == 0) {
                for (int x = i; x >= 0; x--) {
                    if ((x < h) && (i - x < w)) {
                        result[index] = matrix[x][i - x];
                        index++;
                    }
                }
            } else {
                for (int x = 0; x <= i; x++) {
                    if ((x < h) && (i - x < w)) {
                        result[index] = matrix[x][i - x];
                        index++;
                    }
                }
            }
        }
        return result;
    }
}

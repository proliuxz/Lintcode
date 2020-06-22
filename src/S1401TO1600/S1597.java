package S1401TO1600;

public class S1597 {
    public int[][] spiralMatrixIII(int R, int C, int r0, int c0) {
        int size = R * C;
        int x = c0, y = r0;
        int z = 1, a = 1, b = 1;
        int[][] matrix = new int[size][2];
        matrix[0][0] = y;
        matrix[0][1] = x;
        while(z < size) {
            for(int j = 0; j < 2; j++) {
                for(int i = 0; i < a; i++) {
                    if(j == 0) {
                        x += b;
                    }
                    else {
                        y += b;
                    }
                    if(x >= 0 && x < C && y >= 0 && y < R) {
                        matrix[z][0] = y;
                        matrix[z][1] = x;
                        z++;
                    }
                }
            }
            a++;
            b *= -1;
        }
        return matrix;
    }
}

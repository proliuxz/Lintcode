public class S162 {
    public void setZeroes(int[][] matrix) {
        // write your code here
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return;
        boolean firstRowZero = false;
        boolean firstColumnZero = false;
        int h = matrix.length;
        int w = matrix[0].length;

        for (int i = 0; i < h; i++)
        {
            if (matrix[i][0] == 0)
            {
                firstColumnZero = true;
                break;
            }
        }

        for (int i = 0; i < w; i++)
        {
            if (matrix[0][i] == 0)
            {
                firstRowZero = true;
                break;
            }
        }

        for (int i = 1; i < h; i++)
        {
            for (int j = 1; j < w; j++)
            {
                if (matrix[i][j] == 0)
                {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < h; i++)
        {
            for (int j = 1; j < w; j++)
            {
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                {
                    matrix[i][j] = 0;
                }
            }
        }

        if (firstColumnZero)
        {
            for (int i = 0; i < h; i++)
                matrix[i][0] = 0;
        }

        if (firstRowZero)
        {
            for (int i = 0; i < w; i++)
                matrix[0][i] = 0;
        }
    }
}

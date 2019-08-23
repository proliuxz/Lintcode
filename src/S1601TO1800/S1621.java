package S1601TO1800;

public class S1621 {
    public int[][] removeOne(int[][] matrix, int x, int y) {
        // Write your code here
        while(x < matrix.length){
            if(matrix[x][y] == 1)
                matrix[x][y] = 0;
            x++;
        }
        return matrix;
    }
}

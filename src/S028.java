import java.util.Arrays;

public class S028 {
    public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;
        int h = matrix.length;
        int w = matrix[0].length;
        int low = 0;
        int high = h - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            if (matrix[mid][0] > target)
                high = mid - 1;
            else if (matrix[mid][w-1] < target)
                low = mid + 1;
            else
            {
                int res = Arrays.binarySearch(matrix[mid], target);
                return res < 0 ? false : true;
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        S028 s = new S028();
        int[][] matrix = {{1,4,5},{6,7,8}};
        boolean res = s.searchMatrix(matrix,6);
        System.out.println(res);
    }
}

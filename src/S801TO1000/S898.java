package S801TO1000;

public class S898 {
    public int getColumn(int[][] arr) {
        int res = arr[0].length - 1;
        for (int[] row: arr)
            while (row[res] == 1 && res > 0 &&row[res - 1] == 1)
                res--;
        return res;
    }
}

package S001TO200;

public class S034 {
    int res = 0;
    public int totalNQueens(int n) {
        int[] colIndex = new int[n];
        backtracking(0, colIndex);
        return res;
    }

    public void backtracking(int line, int[] colIndex) {
        int n = colIndex.length;
        if (line == n) res ++;
        for (int i = 0; i < n; i++) {
            if (isValid(line, i, colIndex)) {
                colIndex[line] = i;
                backtracking(line + 1, colIndex);
            }
        }
    }

    public boolean isValid(int x, int y, int[] colIndex) {
        for (int i = 0; i < x; i++) {
            int j = colIndex[i];
            if (y == j || x + y == i + j || x - y == i - j) {
                return false;
            }
        }
        return true;
    }
}

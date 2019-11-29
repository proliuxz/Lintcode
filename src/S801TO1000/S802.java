package S801TO1000;

public class S802 {
    public void solveSudoku(int[][] board) {
        solve(0, 0, board);
    }

    private boolean solve(int r, int c, int[][] board) {
        if (r == 9 || (r == 8 && c == 9)) {   // finished
            return true;
        }

        if (c == 9) {  // go to next row and reset col to 0
            c = 0;
            r++;
        }

        for (int j = c; j < 9; j++) {
            if (board[r][j] == 0) {
                for (int k = 1; k <= 9; k++) {
                    if (valid(r, j, k, board)) {
                        board[r][j] = k;
                        if (solve(r, j + 1, board)) {
                            return true;
                        }
                        board[r][j] = 0; // backtrack since previour choices proved to be incorrect.
                    }
                }
                return false;
            }
        }
        return solve(r + 1, 0, board);
    }

    private boolean valid(int x, int y, int k, int[][] board) {
        for (int j = 0; j < 9; j++)
            if (board[x][j] == k)
                return false;

        for (int i = 0; i < 9; i++)
            if (board[i][y] == k)
                return false;

        for (int i = 3 * (x / 3); i < 3 * (x / 3) + 3; i++)
            for (int j = 3 * (y / 3); j < 3 * (y / 3) + 3; j++)
                if (board[i][j] == k)
                    return false;

        if (x == y) {
            for (int i = 0; i < 9; i++)
                if (board[i][i] == k)
                    return false;
        }

        if (x + y == 8) {
            for (int i = 0; i < 9; i++)
                if (board[i][8 - i] == k)
                    return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] board = new int[][]{
                {0, 0, 0, 0, 0, 0, 7, 5, 0},
                {0, 0, 7, 0, 0, 6, 0, 0, 2},
                {0, 9, 0, 8, 0, 3, 0, 0, 1},
                {0, 0, 1, 0, 6, 0, 5, 7, 0},
                {0, 0, 0, 1, 0, 4, 0, 0, 0},
                {0, 6, 9, 0, 5, 0, 1, 0, 0},
                {4, 0, 0, 9, 0, 5, 0, 6, 0},
                {5, 0, 0, 4, 0, 0, 2, 0, 0},
                {0, 2, 3, 0, 0, 0, 0, 0, 0}};
        S802 s = new S802();
        s.solveSudoku(board);
        for (int[] line : board
        ) {
            for (int i = 0; i < line.length; i++) {
                System.out.print(line[i]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

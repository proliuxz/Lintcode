package S001TO200;

public class S123 {
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length < 1 || word == null || word.length() < 1)
            return false;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(helper(board,word, 0, i, j)) return true;
            }
        }
        return false;
    }

    private boolean helper(char[][] board, String word, int index, int row, int col) {
        int[][] dirs = new int[][] {{0,1},{0,-1},{1,0},{-1,0}};
        if (index == word.length()) return true;
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || board[row][col] != word.charAt(index))
            return false;

        board[row][col] = '*';
        for (int[] dir : dirs) {
            if (helper(board, word, index + 1, row + dir[0], col + dir[1]))
                return true;
        }
        board[row][col] = word.charAt(index);
        return false;
    }
}

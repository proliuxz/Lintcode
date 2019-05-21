package S201TO400;

import java.util.HashSet;

public class S389 {
    public boolean isValidSudoku(char[][] board) {
        if (board.length!=9||board[0].length!=9)
            return false;

        char[] temp = new char[9];
        for (int i = 0; i < 9; i++)
        {
            if (isValid(board[i]) == false)
                return false;
        }

        for (int m = 0; m < 9; m++)
        {
            for (int n = 0; n < 9; n++)
            {
                temp[n] = board[n][m];
            }
            if (isValid(temp) == false)
                return false;
        }

        for (int p = 0; p < 9; p++)
        {
            for (int q = p / 3 * 3; q < p / 3 * 3 + 3; q++)
            {
                for (int r = p % 3 * 3; r < p % 3 * 3 + 3; r++)
                {
                    temp[q%3*3+r%3] = board[q][r];
                }
            }
            if (isValid(temp) == false)
                return false;
        }
        return true;
    }

    public boolean isValid(char[] check)
    {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < 9; i++)
        {
            if (check[i] != '.')
            {
                if (!set.add(check[i]))
                {
                    return false;
                }
            }
        }
        return true;
    }
}

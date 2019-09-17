package S1001TO1200;

public class S1022 {
    public boolean validTicTacToe(String[] board) {
        // Write your code
        int Xnum = 0;
        int Onum = 0;
        int[][] row = new int[2][3];
        int[][] col = new int[2][3];
        int[][] dia = new int[2][3];
        boolean[] succ= new boolean[2];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(board[i].charAt(j) == 'X') {
                    row[0][i] ++;
                    col[0][j] ++;
                    Xnum++;
                    if( i == j)
                        dia[0][0]++;
                    if( i+j == 2)
                        dia[1][0]++;
                    if(row[0][i] ==3 || col[0][j] == 3 || dia[0][0] == 3 || dia[1][0] ==3){
                        succ[0] = true;
                    }
                }
                if(board[i].charAt(j) == 'O') {
                    row[1][i]++;
                    col[1][j]++;
                    Onum++;
                    if(i == j )
                        dia[0][1]++;
                    if(i + j == 2)
                        dia[1][1]++;
                    if(row[1][i] == 3 || col[1][j] == 3 || dia[0][1] == 3 || dia[1][1] == 3 ) {
                        succ[1] =true;
                    }
                }
            }
        }
        if(Onum !=Xnum - 1 && Onum != Xnum)
            return false;
        if(Xnum != Onum + 1 && succ[0] == true)
            return false;
        if(Xnum != Onum && succ[1] == true)
            return false;

        return true;
    }
}

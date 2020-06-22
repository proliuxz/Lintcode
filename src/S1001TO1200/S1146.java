package S1001TO1200;

public class S1146 {
    public int[][] ChessPieceRotation(int[][] A, int[][] F) {
        int[] dirs = new int[]{0, 1, 0, -1, 0};
        for (int[] item : F) {
            int x = item[0] - 1;
            int y = item[1] - 1;
            for (int i = 0; i < 4; i++)
                if (x + dirs[i] > -1 && x + dirs[i] < 4 && y + dirs[i + 1] > -1 && y + dirs[i + 1] < 4)
                    A[x + dirs[i]][y + dirs[i + 1]] = 1 - A[x + dirs[i]][y + dirs[i + 1]];
        }
        return A;
    }
}

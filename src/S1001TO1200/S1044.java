package S1001TO1200;

public class S1044 {
    public int orderOfLargestPlusSign(int N, int[][] mines) {
        // Write your code here
        int[][] pos = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
        return N * N == mines.length ? 0 : 1;
    }
}

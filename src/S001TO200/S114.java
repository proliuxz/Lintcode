package S001TO200;

public class S114 {
    public int uniquePaths(int m, int n) {
        // write your code here
        int mm = m + n - 2;
        int nn = Math.min(n, m) - 1;
        long ret = 1;
        for (int i = 0; i < nn; i++) {
            ret *= mm--;
            ret /= i+1;
        }
        return (int) ret;
    }
}

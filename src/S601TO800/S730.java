package S601TO800;

public class S730 {
    public int subSum(int n) {
        // write your code here
        return (int) ((1 + n) * n / 2 * Math.pow(2, n-1));
    }
}

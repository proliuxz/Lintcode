package S1801TO2000;

public class S1807 {
    public int fibonacci(int n) {
        // write your code here
        if (n < 3)
            return n - 1;
        int[] f = new int[n];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i < n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n-1];
    }
}

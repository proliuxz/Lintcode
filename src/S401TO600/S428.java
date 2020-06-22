package S401TO600;

public class S428 {
    public double myPow(double x, int n) {
        if (n > Integer.MAX_VALUE || n < Integer.MIN_VALUE)
            return 0;
        if (n == 0)
            return 1;
        if (n < 0)
            return ((1 / x) * myPow(1 / x, -(n + 1)));
        return (n % 2 == 0) ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
    }
}

package S801TO1000;

public class S845 {
    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b,a % b);
    }
}

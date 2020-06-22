package S1201TO1400;

public class S1325 {
    public int rangeBitwiseAnd(int m, int n) {
        while (m < n)
            n = n & (n - 1);
        return n;
    }
}

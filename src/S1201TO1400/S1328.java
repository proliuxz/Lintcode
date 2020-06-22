package S1201TO1400;

public class S1328 {
    public int DoubleChange(int A, int B, int p, int q) {
        return DoubleChangeLong(A, B, p, q);
    }

    public int DoubleChangeLong(long A, long B, long p, long q) {
        if (B <= A)
            return 0;
        if (B <= A + p)
            return 1;
        return DoubleChangeLong(A, B, p * q, q) + 1;
    }
}

package S1601TO1800;

public class S1799 {
    public long equlSum(long i, long j, long k) {
        // Write your code here
        return equlSum(i, j) + equlSum(k, j) - j;
    }

    private long equlSum(long s, long e)
    {
        return (s + e) * (e - s + 1) / 2;
    }
}

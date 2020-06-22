package S1801TO2000;

public class S1878 {
    public long RotatedNums(int n) {
        if (n == 1)
            return 5;
        if (n == 2)
            return 6;
        if (n == 3)
            return 30;
        return 7 * RotatedNums(n - 2);
    }
}

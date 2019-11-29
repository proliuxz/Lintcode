package S1201TO1400;

public class S1276 {
    public int getSum(int a, int n) {
        // wirte your code here
        return n == 0 ? a : getSum(a ^ n, (a & n) << 1);
    }
}

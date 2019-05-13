package S001TO200;

public class S002 {
    public long trailingZeros(long n) {
        // write your code here, try to do it without arithmetic operators.
        long res = 0;
        long temp = n / 5;
        while (temp != 0) {
            res += temp;
            temp /= 5;
        }
        return res;
    }
}

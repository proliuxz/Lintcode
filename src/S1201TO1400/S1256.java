package S1201TO1400;

public class S1256 {
    public int findNthDigit(int n) {
        long factor = 9L, digit = 1L;
        while (n > factor * digit) {
            n -= (int) (factor * (digit++));
            factor *= 10;
        }
        int cFactor = (int) factor;
        int cDigit = (int) digit;

        return String.valueOf((n - 1) / cDigit + cFactor / 9).charAt((n - 1) % cDigit) - '0';
    }
}

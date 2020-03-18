package S1201TO1400;

public class S1294 {
    public boolean isPowerOfThree(int n) {
        n = Math.abs(n);
        int num = 1;
        while (num <= n) {
            if (num == n)
                return true;
            num *= 3;
        }
        return false;
    }
}

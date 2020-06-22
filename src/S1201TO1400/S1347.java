package S1201TO1400;

public class S1347 {
    public int trailingZeroes(int n) {
        int res = 0;
        int temp = n / 5;
        while (temp != 0) {
            res += temp;
            temp /= 5;
        }
        return res;
    }
}

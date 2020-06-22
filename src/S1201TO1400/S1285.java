package S1201TO1400;

public class S1285 {
    public boolean isPowerOfFour(int num) {
        if (num < 1)
            return false;
        while (num % 4 == 0)
            num /= 4;
        return num == 1 ? true : false;
    }
}

package S001TO200;

public class S142 {
    public boolean checkPowerOf2(int n) {
        // write your code here
        if (n <= 0)
            return false;
        return (n & (n - 1)) == 0;
    }
}

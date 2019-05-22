package S601TO800;

public class S771 {
    public long doubleFactorial(int n) {
        // Write your code here
        long res = 1;
        for (int i = n; i > 0; i = i - 2) {
            res *= i;
        }
        return res;
    }
}

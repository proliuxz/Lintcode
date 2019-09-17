package S601TO800;

public class S765 {
    public boolean isValidTriangle(int a, int b, int c) {
        // write your code here
        return a > 0 && b > 0 && c > 0 && (a + b > c) && (a - b < c);
    }
}

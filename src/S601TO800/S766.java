package S601TO800;

public class S766 {
    public boolean isLeapYear(int n) {
        // write your code here
        return n % 100 == 0 ? n % 400 == 0 : n % 4 == 0;
    }
}

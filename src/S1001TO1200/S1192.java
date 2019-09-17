package S1001TO1200;

public class S1192 {
    public int findLUSlength(String a, String b) {
        // write your code here
        return a.equals(b) ? -1 : Math.max(a.length(), b.length());
    }
}

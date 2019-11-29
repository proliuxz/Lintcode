package S601TO800;

public class S686 {
    public String removeExtra(String s) {
        // write your code here
        return s.trim().replaceAll("\\s{1,}", " ");
    }
}

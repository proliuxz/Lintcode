package S1401TO1600;

public class S1540 {
    public boolean canConvert(String s, String t) {
        // Write your code here
        if (s == null && t == null)
            return true;

        if (s == null || t == null || s.length() < t.length())
            return false;

        int j = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (j == t.length())
                return true;
            if (s.charAt(i) == t.charAt(j))
                j ++;
        }
        return j == t.length() ? true : false;
    }
}

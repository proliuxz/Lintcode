package S001TO200;

public class S154 {
    public boolean isMatch(String s, String p) {
        if (p.isEmpty())
            return s.isEmpty();
        boolean matchOne = !s.isEmpty() && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.');

        if (p.length() >= 2 && p.charAt(1) == '*')
            return (isMatch(s, p.substring(2)) || (matchOne && isMatch(s.substring(1), p)));
        else
            return matchOne && isMatch(s.substring(1), p.substring(1));
    }
}

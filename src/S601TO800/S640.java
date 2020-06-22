package S601TO800;

public class S640 {
    public boolean isOneEditDistance(String s, String t) {
        int lenS = s.length();
        int lenT = t.length();
        int diff = Math.abs(lenS - lenT);
        if (diff > 1)
            return false;

        for (int i = 0; i < Math.min(lenS, lenT); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                if (lenS == lenT)
                    return s.substring(i + 1).equals(t.substring(i + 1));
                if (lenS < lenT)
                    return s.substring(i).equals(t.substring(i + 1));
                else
                    return s.substring(i + 1).equals(t.substring(i));
            }
        }
        return diff == 1;
    }
}

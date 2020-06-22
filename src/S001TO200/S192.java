package S001TO200;

import java.util.Arrays;

public class S192 {
    public boolean isMatch(String s, String p) {
        if (p.length() == 0)
            return (s.length() == 0);
        int sLen = s.length();
        int pLen = p.length();

        boolean[][] lookup = new boolean[sLen + 1][pLen + 1];
        lookup[0][0] = true;

        for (int j = 1; j <= pLen; j++)
            if (p.charAt(j - 1) == '*')
                lookup[0][j] = lookup[0][j - 1];

        for (int i = 1; i <= sLen; i++) {
            for (int j = 1; j <= pLen; j++) {
                if (p.charAt(j - 1) == '*')
                    lookup[i][j] = lookup[i][j - 1] || lookup[i - 1][j];
                else if (p.charAt(j - 1) == '?' || s.charAt(i - 1) == p.charAt(j - 1))
                    lookup[i][j] = lookup[i - 1][j - 1];
                else lookup[i][j] = false;
            }
        }
        return lookup[sLen][pLen];
    }
}

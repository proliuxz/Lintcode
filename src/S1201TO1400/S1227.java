package S1201TO1400;

public class S1227 {
    public boolean repeatedSubstringPattern(String s) {
        int l = s.length();
        int[] next = new int[l];
        next[0] = -1;
        int i, j = -1;
        for (i = 1; i < l / 2; i++) {
            if (l % j != 0)
                continue;
            while (j >= 0 && s.charAt(i) != s.charAt(j + 1))
                j = next[j];

            if (s.charAt(i) == s.charAt(j + 1))
                j++;
            next[i] = j;
        }
        int lenSub = l - 1 - next[l - 1];
        return lenSub != l && l % lenSub ==0;
    }
}

package S1201TO1400;

public class S1389 {
    public int[] shortestToChar(String S, char C) {
        int len = S.length();
        int[] res = new int[len];
        int pos = -len;
        for (int i = 0; i < len; i++) {
            if (S.charAt(i) == C)
                pos = i;
            res[i] = i - pos;
        }
        for (int i = len - 1; i >= 0; i--) {
            if (S.charAt(i) == C)
                pos = i;
            res[i] = Math.min(res[i], Math.abs(i - pos));
        }
        return res;
    }
}

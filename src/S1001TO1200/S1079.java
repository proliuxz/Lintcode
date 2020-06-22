package S1001TO1200;

public class S1079 {
    public int countBinarySubstrings(String s) {
        int pre = 0, cur = 1, res = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1))
                cur++;
            else {
                pre = cur;
                cur = 1;
            }
            if (pre >= cur)
                res++;
        }
        return res;
    }
}

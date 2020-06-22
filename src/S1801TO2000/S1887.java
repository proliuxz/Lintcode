package S1801TO2000;

public class S1887 {
    public long StretchWord(String S) {
        long res = 1;
        if (S == null || S.length() == 0)
            return res;

        char pre = S.charAt(0);
        int cnt = 1;

        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) == pre)
                cnt++;
            else {
                if (cnt >= 2)
                    res *= 2;
                pre = S.charAt(i);
                cnt = 1;
            }
        }
        if (cnt > 2)
            res *= 2;
        return res;
    }
}

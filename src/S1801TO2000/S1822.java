package S1801TO2000;

public class S1822 {
    public int MinimumMoves(String S) {
        int res = 0;
        for (int i = 0 ; i < S.length();) {
            int next = i + 1;
            while (next < S.length() && S.charAt(i) == S.charAt(next))
                next++;
            res += (next - i) / 3;
            i = next + 1;
        }
        return res;
    }
}

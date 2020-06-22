package S401TO600;

import java.util.stream.IntStream;

public class S570 {
    private boolean found;
    private int res = 0;
    private boolean[] exist;

    public int findMissing2(int n, String str) {
        exist = new boolean[n + 1];
        dfs(0, n, str);
        return res;
    }

    private void dfs(int l, int n, String s) {
        if (l >= s.length()) {
            if (!found) {
                res = IntStream.rangeClosed(1, n).filter(k -> !exist[k]).findFirst().orElse(res);
                found = true;
            }
            return;
        }
        int sum = s.charAt(l) - '0';
        if (sum == 0)
            return;

        while (sum <= n) {
            if (!exist[sum]) {
                exist[sum] = true;
                dfs(l + 1, n, s);
                exist[sum] = false;
            }
            l++;
            if (l >= s.length()) {
                break;
            }
            sum = sum * 10 + (s.charAt(l) - '0');
        }
    }
}

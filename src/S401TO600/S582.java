package S401TO600;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class S582 {
    List<String> res = new ArrayList<String>();
    boolean[] f = null;
    char[] s;
    Set<String> dict = null;
    int n;

    boolean dfs(int p, String now) {
        if (p == n) {
            res.add(now);
            return true;
        }
        if (!f[p])
            return false;
        if (p > 0)
            now += " ";

        boolean success = false;
        String cur = "";
        for (int i = p; i < n; ++i) {
            cur += s[i];
            if (dict.contains(cur))
                success |= dfs(i + 1, now + cur);
        }

        f[p] = success;
        return success;
    }

    public List<String> wordBreak(String ss, Set<String> wordDict) {
        dict = wordDict;
        s = ss.toCharArray();
        n = s.length;
        int i;
        f = new boolean[n];
        for (i = 0; i < n; ++i)
            f[i] = true;

        dfs(0, "");
        return res;
    }
}

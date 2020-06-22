package S001TO200;

import java.util.Set;

public class S107 {
    Set<String> dic;
    public boolean wordBreak(String s, Set<String> dict) {
        dic = dict;
        return dfs(s);
    }

    private boolean dfs(String s)
    {
        if (s == null || s.length() == 0)
            return true;
        if (dic.contains(s))
            return true;
        for (int len = 1; len <= s.length(); len++) {
            if (dic.contains(s.substring(0, len)) && dfs(s.substring(len))) {
                return true;
            }
        }
        return false;
    }
}

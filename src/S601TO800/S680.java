package S601TO800;

import java.util.ArrayList;
import java.util.List;

public class S680 {
    public List<List<String>> splitString(String s) {
        List<List<String>> res = new ArrayList<>();
        helper(s, 0, new ArrayList<String>(), res);
        return res;
    }

    private void helper(String s, int p, List<String> cur, List<List<String>> res) {
        if (p == s.length()) {
            res.add(new ArrayList<>(cur));
            return;
        }
        cur.add(String.valueOf(s.charAt(p)));
        helper(s, p + 1, cur, res);
        cur.remove(cur.size() - 1);

        if (p < s.length() - 1) {
            cur.add(s.substring(p, p + 2));
            helper(s, p + 2, cur, res);
            cur.remove(cur.size() - 1);
        }
    }
}

package S1801TO2000;

import java.util.HashSet;
import java.util.Set;

public class S1868 {
    public int find(String S) {
        char[] chars = S.toCharArray();
        int len = chars.length;
        int[] l2r = new int[len];
        int[] r2l = new int[len];
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < len; i++) {
            set.add(chars[i]);
            l2r[i] = set.size();
        }
        set.clear();
        for (int i = len - 1; i > 0 ; i--) {
            set.add(chars[i]);
            r2l[i] = set.size();
        }
        int res = 0;
        for (int i = 0; i < len - 1; i++)
            if (l2r[i] == r2l[i + 1])
                res++;
        return res;
    }
}

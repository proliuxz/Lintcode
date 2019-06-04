package S801TO1000;

import java.util.HashSet;

public class S958 {
    public int[] getStream(String s) {
        // Write your code here
        int len = s.length();
        int[] res = new int[len];
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (set.contains(c))
                set.remove(c);
            else
                set.add(c);
            res[i] = set.size() > 1 ? 0 : 1;
        }
        return res;
    }
}

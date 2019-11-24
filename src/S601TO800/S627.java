package S601TO800;

import java.util.HashSet;
import java.util.Set;

public class S627 {
    public int longestPalindrome(String s) {
        // write your code here
        if (s == null || s.length() == 0)
            return 0;
        Set<Character> set = new HashSet<>();
        for (char c: s.toCharArray()
             ) {
            if (set.contains(c))
                set.remove(c);
            else
                set.add(c);
        }
        return s.length() - (set.size() < 2 ? 0 : set.size() - 1);
    }
}

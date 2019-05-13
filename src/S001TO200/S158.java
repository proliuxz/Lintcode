package S001TO200;

import java.util.HashMap;
import java.util.Map;

public class S158 {
    public boolean anagram(String s, String t) {
        // write your code here
        if (s == null && t == null)
            return true;
        if (s.length() == 0 && t.length() == 0)
            return true;
        if (s.length() != t.length())
            return false;
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray())
        {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray())
        {
            if (!map.containsKey(c))
                return false;
            else {
                int val = map.get(c);
                if (val > 1)
                    map.put(c, val - 1);
                else
                    map.remove(c);
            }
        }
        return map.isEmpty();
    }
}

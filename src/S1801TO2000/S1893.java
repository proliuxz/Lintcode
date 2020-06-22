package S1801TO2000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S1893 {
    public String isValid(String s) {
        if (s == null || s.length() < 2)
            return "YES";
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char c: chars)
            map.put(c, map.getOrDefault(c, 0) + 1);

        List<Integer> values = new ArrayList<>(map.values());
        int diff = 0;
        int pre = values.get(0);
        for (int v: values) {
            int x = Math.abs(pre - v);
            if (v == 1 && x > 1)
                diff += 1;
            else
                diff += x;
            pre = v;
            if (diff > 1)
                return "NO";
        }
        return "YES";
    }
}

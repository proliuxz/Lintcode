package S801TO1000;

import java.util.HashMap;
import java.util.Map;

public class S828 {
    public boolean wordPattern(String pattern, String teststr) {
        Map<String, Character> s2c = new HashMap<>();
        Map<Character, String> c2s = new HashMap<>();
        char[] chars = pattern.toCharArray();
        String[] strs = teststr.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            char c = chars[i];
            if (s2c.containsKey(str) || c2s.containsKey(c))
            {
                if (s2c.containsKey(str) && c2s.containsKey(c))
                {
                    char c2 = s2c.get(str);
                    String str2 = c2s.get(c);
                    if(c != c2 || !str.equals(str2))
                        return false;
                    sb.append(c);
                }
                else
                    return false;
            }
            else {
                s2c.put(str, c);
                c2s.put(c, str);
                sb.append(c);
            }
        }
        return pattern.equals(sb.toString());
    }
}

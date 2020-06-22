package S1201TO1400;

import java.util.HashMap;
import java.util.Map;

public class S1270 {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> dic = new HashMap<>();
        for (char c: magazine.toCharArray())
            dic.put(c, dic.getOrDefault(c, 0) + 1);

        for (char x: ransomNote.toCharArray()) {
            if (!dic.containsKey(x))
                return false;
            int cnt = dic.get(x);
            if (cnt - 1 > 0)
                dic.put(x, cnt - 1);
            else
                dic.remove(x);
        }
        return true;
    }
}

package S401TO600;

import java.util.HashMap;
import java.util.Map;

public class S557 {
    public Map<Character, Integer> countCharacters(String str) {
        // write your code here
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();
        for(char c : chars)
        {
            int val = map.getOrDefault(c, 0) + 1;
            map.put(c, val);
        }
        return map;
    }
}

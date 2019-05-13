package SS;

import java.util.HashMap;
import java.util.Map;

public class SS1654 {
    public int mostFrequentlyAppearingLetters(String str) {
        // Write your code here.
        int res = 0;
        if (str == null || str.length() == 0)
            return res;

        Map<Character, Integer> map = new HashMap<>();
        for(char c : str.toCharArray())
        {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char c : map.keySet())
        {
            int tmp = map.get(c);
            if (tmp > res)
                res = tmp;
        }
        return res;
    }
}

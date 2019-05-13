package S001TO200;

import java.util.HashMap;

public class S055 {
    public boolean compareStrings(String A, String B) {
        // write your code here
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c: A.toCharArray()
             ) {
            map.put(c, map.getOrDefault(c,0) + 1);
        }

        for (char c: B.toCharArray()
             ) {
            if(!map.containsKey(c))
                return false;
            int val = map.get(c) - 1;
            if (val > 0)
                map.put(c, val);
            else
                map.remove(c);
        }
        return true;
    }
}

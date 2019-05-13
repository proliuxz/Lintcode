package S201TO400;

import java.util.HashMap;
import java.util.Map;

public class S211 {
    public boolean Permutation(String A, String B) {
        // write your code here
        Map<Character, Integer> map = new HashMap<>();
        for(char c : A.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : B.toCharArray()){
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

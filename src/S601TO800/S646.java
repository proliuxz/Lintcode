package S601TO800;

import java.util.HashMap;
import java.util.Map;

public class S646 {
    public int firstUniqChar(String s) {
        // write your code here
        char[] arr = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length ; i++) {
            char c = arr[i];
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
}

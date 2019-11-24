package S601TO800;

import java.util.HashMap;
import java.util.Map;

public class S644 {
    public boolean isStrobogrammatic(String num) {
        // write your code here
        if (num == null || num.length() == 0)
            return true;
        Map<Character, Character> map = new HashMap<>();
        map.put('0','0');
        map.put('1','1');
        map.put('2','5');
        map.put('5','2');
        map.put('6','9');
        map.put('8','8');
        map.put('9','6');
        StringBuilder sb = new StringBuilder();
        for (char c: num.toCharArray()
             ) {
            if (!map.containsKey(c))
                return false;
            sb.append(map.get(c));
        }
        return sb.reverse().toString().equals(num);
    }
}

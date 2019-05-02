import java.util.HashMap;
import java.util.HashSet;

public class S209 {
    public char firstUniqChar(String str) {
        // Write your code here
        HashMap<Character, Integer> map = new HashMap<>();
        char[] vc = str.toCharArray();
        for(char c : vc)
            map.put(c, map.getOrDefault(c,0) + 1);

        for(char c : vc)
            if(map.get(c) == 1)
                return c;
        return '0';
    }
}

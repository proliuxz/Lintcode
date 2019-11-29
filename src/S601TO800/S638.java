package S601TO800;

import java.util.HashMap;
import java.util.Map;

public class S638 {
    public boolean isIsomorphic(String s, String t) {
        // write your code here
        String ss = helper(s);
        String tt = helper(t);
        return ss.equals(tt);
    }

    private String helper(String s)
    {
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        Map<Character, Character> map = new HashMap<>();
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            char o = arr[i];
            if (map.containsKey(o))
                sb.append(map.get(o));
            else
            {
                char t = (char) ( 'a' + idx);
                sb.append(t);
                map.put(o, t);
                idx++;
            }
        }
        return sb.toString();
    }
}

package S1001TO1200;

import java.util.HashMap;
import java.util.Map;

public class S1186 {
    private Map<Long, String> map = new HashMap();
    public String encode(String longUrl) {
        boolean repeat = true;
        long cur = 0;
        while (repeat)
        {
            cur = System.currentTimeMillis();
            repeat = map.containsKey(cur);
        }
        map.put(cur, longUrl);
        return String.valueOf(cur);
    }


    public String decode(String shortUrl) {
        long cur = Long.valueOf(shortUrl);
        if (map.containsKey(cur)) {
            return map.get(cur);
        } else return "";
    }
}

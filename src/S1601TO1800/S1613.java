package S1601TO1800;

import java.util.HashMap;
import java.util.Map;

public class S1613 {
    public String highestFrequency(String[] ipLines) {
        // Write your code here
        Map<String, Integer> map = new HashMap<>();
        for (String ip: ipLines
             ) {
            int val = map.getOrDefault(ip, 0);
            map.put(ip, val + 1);
        }

        String res = ipLines[0];
        int freq = 0;
        for (String ip: map.keySet()
             ) {
            int f = map.get(ip);
            if (f > freq)
            {
                freq = f;
                res = ip;
            }
        }
        return res;
    }
}

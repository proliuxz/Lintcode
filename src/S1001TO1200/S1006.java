package S1001TO1200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S1006 {
    public List<String> subdomainVisits(String[] cpdomains) {
        // Write your code here
        Map<String, Integer> map = new HashMap<>();
        for(String domain: cpdomains)
        {
            String[] tu = domain.split(" ");
            int t = Integer.parseInt(tu[0]);
            String[] p = tu[1].split("\\.");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < p.length ; i++) {
                if (i != 0)
                    sb.insert(0, ".");
                sb.insert(0, p[p.length - 1 -i]);
                String s = sb.toString();
                map.put(s,map.getOrDefault(s, 0) + t);
            }
        }
        List<String> res = new ArrayList();
        for(String str : map.keySet()){
            res.add(map.get(str) + " " + str);
        }
        return res;
    }
}

package S1601TO1800;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S1789 {
    public String[] DistinguishUsername(String[] names) {
        // Write your code here
        if (names == null || names.length == 0)
            return names;
        Map<String, Integer> map = new HashMap();
        List<String> result = new ArrayList();
        for (String name: names
             ) {
            if (!map.containsKey(name))
                map.put(name,1);
            else{
                int val = map.get(name);
                map.put(name, val + 1);
                name = name + val;
            }
            result.add(name);
        }
        String[] res = result.toArray(new String[result.size()]);
        return res;
    }
}

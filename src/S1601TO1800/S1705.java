package S1601TO1800;

import java.util.Map;
import java.util.TreeMap;

public class S1705 {
    public int[] compareStringii(String A, String B) {
        // write your code here
        String[] sources = A.split(",");
        String[] targets = B.split(",");
        int[] res = new int[targets.length];
        int[] tmp = new int[sources.length];
        for (int i = 0; i < sources.length; i++) {
            tmp[i] = getComparingNum(sources[i]);
        }
        for (int i = 0; i < targets.length; i++) {
            int r = 0;
            int t = getComparingNum(targets[i]);
            for (int j = 0; j < tmp.length; j++) {
                if (t > tmp[j])
                    r++;
            }
            res[i] = r;
        }
        return res;
    }

    private int getComparingNum(String s)
    {
        Map<Character, Integer> map = new TreeMap<>();
        for (char c: s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);
        for (char key: map.keySet())
            return map.get(key);
        return 0;
    }
}

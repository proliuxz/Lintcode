package S1601TO1800;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S1728 {
    public boolean hasGroupsSizeX(List<Integer> deck) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] count = new int[10000];
        for (int c : deck)
            map.put(c, map.getOrDefault(c, 0) + 1);

        int g = -1;
        for (int key : map.keySet()) {
            int val = map.get(key);
            if (g == -1)
                g = val;
            else
                g = gcd(g, val);
        }

        return g >= 2;
    }

    public int gcd(int x, int y) {
        return x == 0 ? y : gcd(y % x, x);
    }
}

package S1801TO2000;

import java.util.HashMap;
import java.util.Map;

public class S1854 {
    public boolean partitionArratIII(int[] array, int k) {
        if (array.length % k != 0)
            return false;

        Map<Integer, Integer> map = new HashMap<>();
        for (int num: array)
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int pt = array.length / k;
        for (int key: map.keySet())
            if (map.get(key) > pt)
                return false;

        return true;
    }
}

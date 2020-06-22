package S1401TO1600;

import java.util.HashMap;
import java.util.Map;

public class S1523 {
    public boolean PartitioningArray(int[] A, int k) {
        if (A.length % k != 0)
            return false;

        Map<Integer, Integer> map = new HashMap<>();
        for (int num: A)
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int pt = A.length / k;
        for (int key: map.keySet())
            if (map.get(key) > pt)
                return false;

        return true;
    }
}

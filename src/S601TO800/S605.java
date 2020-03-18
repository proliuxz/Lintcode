package S601TO800;

import java.util.HashMap;
import java.util.Map;

public class S605 {
    public boolean sequenceReconstruction(int[] org, int[][] seqs) {
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> pre = new HashMap<>();
        for (int i = 0; i < org.length; ++i)
            map.put(org[i], i);
        for (int[] seq: seqs) {
            for (int i = 0; i < seq.length; ++i) {
                if (!map.containsKey(seq[i]))
                    return false;
                if (i > 0 && map.get(seq[i - 1]) >= map.get(seq[i]))
                    return false;
                if (!pre.containsKey(seq[i]))
                    pre.put(seq[i], (i > 0) ? map.get(seq[i - 1]) : -1);
                else
                    pre.put(seq[i], Math.max(pre.get(seq[i]), (i > 0) ? map.get(seq[i - 1]) : -1));
            }
        }
        for (int i = 0; i < org.length; ++i)
            if (!pre.containsKey(org[i]) || pre.get(org[i]) != i - 1)
                return false;
        return true;
    }
}

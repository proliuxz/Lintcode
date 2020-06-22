package S1601TO1800;

import java.util.HashSet;
import java.util.Set;

public class S1743 {
    public int subarrayBitwiseORs(int[] A) {
        Set<Integer> res = new HashSet<>();
        Set<Integer> pre = new HashSet<>();
        for (int i : A) {
            Set<Integer> cur = new HashSet<>();
            cur.add(i);
            for (int j : pre)
                cur.add(i | j);
            pre = cur;
            res.addAll(cur);
        }
        return res.size();
    }
}

package S1801TO2000;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class S1895 {
    public int TotalCost(List<List<Integer>> cost) {
        int len = cost.size();
        int n = len / 2;
        Collections.sort(cost, Comparator.comparing(a -> (a.get(0) - a.get(1))));
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += cost.get(i).get(0);
            result += cost.get(len - n - 1).get(1);
        }
        return result;
    }
}

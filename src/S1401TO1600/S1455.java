package S1401TO1600;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class S1455 {
    public int isValid(List<Integer> a) {
        // Write your code here
        Set<Integer> set = new TreeSet<>();
        for (int num: a
             ) {
            if (!set.add(num))
                set.remove(num);
        }
        if (set.size() == 1)
            for (int res: set)
                return res;
        return -1;
    }
}

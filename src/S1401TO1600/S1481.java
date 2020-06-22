package S1401TO1600;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class S1481 {
    public List<String> uniqueSubstring(String s, int k) {
        List<String> res = new ArrayList<>();
        Set<String> set = new TreeSet<>();
        for (int i = 0; i < s.length() - k + 1; i++)
            set.add(s.substring(i, i + k));
        res.addAll(set);
        return res;
    }
}

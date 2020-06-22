package S601TO800;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class S774 {
    public List<String> findRepeatedDna(String s) {
        Set<String> store = new HashSet<>();
        Set<String> res = new HashSet<>();
        for (int i = 0; i < s.length() - 9; i++) {
            String t = s.substring(i, i + 10);
            if (!store.add(t))
                res.add(t);
        }
        return new ArrayList<>(res);
    }
}

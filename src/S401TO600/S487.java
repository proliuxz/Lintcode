package S401TO600;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class S487 {
    public List<String> nameDeduplication(String[] names) {
        // write your code here
        List<String> result = new ArrayList<>();
        if (names == null || names.length == 0)
            return result;

        HashSet<String> set = new HashSet<>();
        for (String name: names
             ) {
            set.add(name.toLowerCase());
        }
        result = new ArrayList<>(set);
        return result;
    }
}

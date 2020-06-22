package S201TO400;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class S231 {
    private HashMap<String, List<String>> map = new HashMap<>();

    public S231(Set<String> dict) {
        for (String str : dict) {
            int len = str.length();
            for (int i = 0; i < len; ++i)
                for (int j = i + 1; j <= len; ++j) {
                    String tmp = str.substring(i, j);
                    if (!map.containsKey(tmp)) {
                        map.put(tmp, new ArrayList<>());
                        map.get(tmp).add(str);
                    } else {
                        List<String> index = map.get(tmp);
                        if (!str.equals(index.get(index.size() - 1)))
                            index.add(str);
                    }
                }
        }
    }

    public List<String> search(String str) {
        // Write your code here
        if (!map.containsKey(str))
            return new ArrayList<>();
        else
            return map.get(str);

    }
}

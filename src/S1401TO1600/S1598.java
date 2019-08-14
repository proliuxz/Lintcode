package S1401TO1600;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S1598 {
    Map<String, Integer> map = new HashMap<>();
    public String[] uncommonFromSentences(String A, String B) {
        // Write your code here.
        List<String> list = new ArrayList<>();
        helper(A);
        helper(B);
        for (String key: map.keySet()
             ) {
            if (map.get(key) == 1)
                list.add(key);
        }
        return list.toArray(new String[0]);
    }

    private void helper(String s)
    {
        String[] arr = s.split(" ");
        for (String word : arr
             ) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
    }
}

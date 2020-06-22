package S1801TO2000;

import java.util.HashMap;
import java.util.Map;

public class S1867 {
    public String mostCommonWord(String paragraph) {
        paragraph += ".";

        String str = paragraph.toLowerCase();
        str = str.replaceAll("[\\pP\\pS]", "");
        String[] arr = str.split(" ");

        Map<String, Integer> map = new HashMap<>();
        for (String ss : arr) {
            if (!ss.trim().isEmpty())
                map.put(ss.trim(), map.getOrDefault(ss.trim(), 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        String result = "";
        for (String key : map.keySet()) {
            int val = map.get(key);
            if (val > max) {
                max = val;
                result = key;
            }
            else if (val == max && key.compareTo(result) < 0)
                result = key;
        }
        return result;
    }
}
